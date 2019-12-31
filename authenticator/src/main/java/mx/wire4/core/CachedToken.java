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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dmfs.oauth2.client.OAuth2AccessToken;

import java.io.Serializable;

/**
 * <i>Fecha de creación: 21 de octubre, 2019</i>
 *
 * @author Saintiago García
 * @version 1.0
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
public class CachedToken implements Serializable {

    private String userKey;

    private String userSecret;

    private OAuth2AccessToken token;
}
