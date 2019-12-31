/*
 * COPYRIGHT © 2017. TCPIP.
 * PATENT PENDING. ALL RIGHTS RESERVED.
 * SPEI GATEWAY IS REGISTERED TRADEMARKS OF TCPIP.
 *
 * This software is confidential and proprietary information of TCPIP.
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the company policy.
 */
package mx.wire4.webhook.verification.signature;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Hex;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * <i>Fecha de creación: 29 de marzo, 2019</i>
 *
 * @author Saintiago García
 * @version 1.0
 */
@Slf4j
public final class UtilsCompute implements Serializable {

    private static final Charset DEFAULT_ENCODING = StandardCharsets.UTF_8;

    private static final String HMAC_SHA512 = "HmacSHA512";

    /*
     * Constructor privado para evitar instanciar está clase.
     */
    private UtilsCompute() {

        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Obtiene la firma usando HMAC/SHA-512 para un mensaje y la llave especificada.
     *
     * @param key
     *      la llave usada para generar la firma.
     * @param message
     *      el mensaje a firmar.
     *
     * @return byte[]
     *      la firma como un arreglo de bytes.
     *
     * @throws NoSuchAlgorithmException
     *      en caso de no usar un algoritmo válido.
     * @throws InvalidKeyException
     *      sí la llave no puede ser usada para firmar el mensaje.
     */
    private static byte[] computeHmacSha512(final String message, final String key)
            throws NoSuchAlgorithmException, InvalidKeyException {

        final SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(DEFAULT_ENCODING), HMAC_SHA512);
        final Mac mac = Mac.getInstance(HMAC_SHA512);

        mac.init(keySpec);

        return mac.doFinal(message.getBytes(DEFAULT_ENCODING));
    }

    /**
     * Converts an array of bytes into a String representing the hexadecimal values of each byte in order. The returned
     *  String will be double the length of the passed array, as it takes two characters to represent any given byte.
     *
     * @param hash byte[]
     *      to convert to Hex characters
     *
     * @return String
     *      A String containing lower-case hexadecimal characters
     */
    private static String asHexString(final byte[] hash) {

        return Hex.encodeHexString(hash);
    }

    /**
     * Compara de forma segura dos firmas en su representación de cadena de texto para comprobar sí son iguales. El
     * tiempo que toma la comparación es independiente del número de carácteres de las cadenas a comparar.
     *
     * @param message
     *      el mensaje a firmar.
     * @param key
     *      la llave usada para generar la firma.
     * @param headerSignature
     *      la firma recibida en el encabezado del mensaje WebHook.
     *
     * @return boolean
     *      <code>true</code> sí y sólo sí, las firmas coinciden, <code>false</code> en otro caso.
     *
     * @throws InvalidKeyException
     *      sí la llave no puede ser usada para firmar el mensaje.
     */
    public static boolean compareWebHookMsgSignatures(final String message, final String key,
                                                      final String headerSignature) throws InvalidKeyException {

        boolean result = false;
        try {

            final byte[]  hash = computeHmacSha512(message, key);

            final String hashStr = UtilsCompute.asHexString(hash);

            result = MessageDigest.isEqual(hashStr.getBytes(DEFAULT_ENCODING),
                    headerSignature.getBytes(DEFAULT_ENCODING));
        } catch (NoSuchAlgorithmException e) {

            // nothing to do
        }

        return result;
    }
}
