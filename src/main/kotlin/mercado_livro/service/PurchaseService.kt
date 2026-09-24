package mercado_livro.service

import jakarta.transaction.Transactional
import mercado_livro.events.PurchaseEvent
import mercado_livro.model.PurchaseModel
import mercado_livro.repository.PurchaseRepository
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class PurchaseService(
    private val purchaseRepository: PurchaseRepository,
    private val applicationEventPublisher: ApplicationEventPublisher
) {

    fun create(purchaseModel: PurchaseModel) {
        purchaseRepository.save(purchaseModel)

        println("Disparando evento de compra")
        applicationEventPublisher.publishEvent(PurchaseEvent(this, purchaseModel))
        println("Finalização do processamento!")

    }

    fun update(purchaseModel: PurchaseModel) {
        purchaseRepository.save(purchaseModel)
    }

}
