import RegistrationRouteConfig from './route.config';
import RegistrationController from './registration.controller';
import RegistrationFactory from './registration.factory';


export default angular.module('myapp.beforelogin.registration', [])
    .config(RegistrationRouteConfig)
    .controller('RegistrationController', RegistrationController)
    .factory('RegistrationFactory', RegistrationFactory)