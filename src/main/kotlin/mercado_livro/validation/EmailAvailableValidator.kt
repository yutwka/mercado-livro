package mercado_livro.validation

import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext
import mercado_livro.service.CustomerService
import kotlin.reflect.KClass

class EmailAvailableValidator(var customerService: CustomerService): ConstraintValidator<EmailAvailable, String> {
    override fun isValid(
        value: String?,
        context: ConstraintValidatorContext?
    ): Boolean {
        if(value.isNullOrEmpty()) {
            return false
        }
    return customerService.emailAvailable(value)
    }

}
