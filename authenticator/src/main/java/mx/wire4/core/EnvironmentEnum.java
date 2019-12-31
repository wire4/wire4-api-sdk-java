/*
 * COPYRIGHT © 2017. TCPIP.
 * PATENT PENDING. ALL RIGHTS RESERVED.
 * SPEI GATEWAY IS REGISTERED TRADEMARKS OF TCPIP.
 *
 * This software is confidential and proprietary information of TCPIP.
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the company policy.
 */
package mx.wire4.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * <i>Fecha de creación: 23 de octubre, 2019</i>
 *
 * @author Saintiago García
 * @version 1.0
 */
@RequiredArgsConstructor
public enum EnvironmentEnum implements Serializable {

    SANDBOX("https://sandbox-api.wire4.mx/token", "https://sandbox-api.wire4.mx/wire4/1.0.0"),

    DEVELOPMENT("https://development-api.wire4.mx/token", "https://development-api.wire4.mx/wire4/1.0.0"),

    PRODUCTION("https://api.wire4.mx/token", "https://api.wire4.mx/wire4/1.0.0");

    @Getter
    private final String tokenUrl;

    @Getter
    private final String serviceUrl;
}
