package mercado_livro.extension

import mercado_livro.controller.request.PostBookRequest
import mercado_livro.controller.request.PostCustomerRequest
import mercado_livro.controller.request.PutBookRequest
import mercado_livro.controller.request.PutCustomerRequest
import mercado_livro.enums.BookStatus
import mercado_livro.enums.CustomerStatus
import mercado_livro.model.BookModel
import mercado_livro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email, status = CustomerStatus.ATIVO)
}

fun PutCustomerRequest.toCustomerModel(previousValue: CustomerModel): CustomerModel {
    return CustomerModel(id = previousValue.id, name = this.name, email = this.email, status = previousValue.status)

}

fun PostBookRequest.toBookModel(customer: CustomerModel): BookModel {
    return BookModel(
        name = this.name,
        price = this.price,
        status = BookStatus.ATIVO,
        customer = customer
    )
}

fun PutBookRequest.toBookModel(previousValue: BookModel): BookModel {
    return BookModel(
        id = previousValue.id,
        name = this.name ?: previousValue.name,
        price = this.price ?: previousValue.price,
        status = previousValue.status,
        customer = previousValue.customer
    )
}