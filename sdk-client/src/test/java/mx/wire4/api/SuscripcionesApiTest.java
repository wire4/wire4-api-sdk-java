/*
 * Wire4RestAPI
 * Referencia de la API de Wire4
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package mx.wire4.api;

import mx.wire4.ApiException;
import mx.wire4.model.ErrorResponse;
import mx.wire4.model.PreEnrollmentData;
import mx.wire4.model.PreEnrollmentResponse;
import mx.wire4.model.ServiceBanking;
import mx.wire4.model.SubscriptionChangeStatusRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SuscripcionesApi
 */
@Ignore
public class SuscripcionesApiTest {

    private final SuscripcionesApi api = new SuscripcionesApi();

    /**
     * Cambia el estatus de la suscripción
     *
     * Se cambia el estado o estatus de la suscripción a los posibles valores que son: ACTIVE o INACTIVE
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeSubscriptionStatusUsingPUTTest() throws ApiException {
        SubscriptionChangeStatusRequest body = null;
        String authorization = null;
        String subscription = null;
        api.changeSubscriptionStatusUsingPUT(body, authorization, subscription);

        // TODO: test validations
    }
    /**
     * Cambia el uso de la suscripción
     *
     * Se asigna o cambia el uso y el estatus que se le dará a la subscripción para los servicios SPEI y SPID en el manejo de Cobros y Pagos El status puede tener los posibles valores: ACTIVE o INACTIVE. El uso puede tener los posibles valores: WITHDRAWAL_DEPOSIT o WITHDRAWAL o DEPOSIT
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeSubscriptionUseUsingPATCHTest() throws ApiException {
        ServiceBanking body = null;
        String authorization = null;
        String subscription = null;
        ServiceBanking response = api.changeSubscriptionUseUsingPATCH(body, authorization, subscription);

        // TODO: test validations
    }
    /**
     * Pre-registro de una suscripción
     *
     * Pre-registra una suscripción para operar un contrato a través de un aplicación socio de la plataforma. Se retorna una dirección URL hacia el centro de autorización donde el cliente  Monex debe autorizar el acceso a los datos de su cuenta a el socio.&lt;br/&gt;&lt;br/&gt;Una vez que el cuentahabiente autorice el acceso, se envía una notificación (webhook configurado) con el evento &#x27;ENROLLMENT.CREATED&#x27;, el cuál contiene los datos de acceso a esta API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void preEnrollmentMonexUserUsingPOSTTest() throws ApiException {
        PreEnrollmentData body = null;
        String authorization = null;
        PreEnrollmentResponse response = api.preEnrollmentMonexUserUsingPOST(body, authorization);

        // TODO: test validations
    }
    /**
     * Elimina suscripción por su identificador.
     *
     * Elimina una suscripción mediante su identificador. Una vez eliminada dicha suscripción, ya no se podrán realizar operaciones en el API utilizando sus credenciales
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeEnrollmentUserUsingDELETETest() throws ApiException {
        String authorization = null;
        String subscription = null;
        api.removeEnrollmentUserUsingDELETE(authorization, subscription);

        // TODO: test validations
    }
    /**
     * Elimina pre-registro de suscripción
     *
     * Se elimina el pre-registro de suscripción. Sólo se elimina en caso de que el cliente Monex no haya concedido su autorización de acceso (token), es decir que la suscripcion esté pendiente.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeSubscriptionPendingStatusUsingDELETETest() throws ApiException {
        String authorization = null;
        String subscription = null;
        api.removeSubscriptionPendingStatusUsingDELETE(authorization, subscription);

        // TODO: test validations
    }
}
