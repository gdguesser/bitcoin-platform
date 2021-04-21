package br.platform.repository;

import br.platform.model.Ordem;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.ArrayList;
import java.util.List;

@QuarkusTest
public class OrdemRepositoryTest {

    @InjectMock
    OrdemRepository ordemRepository;

    @Test
    public void testIfListAllReturnsCorrectOrders() {

        Ordem firstOrder = new Ordem();
        Ordem secondOrder = new Ordem();
        List<Ordem> orders = new ArrayList<Ordem>();

        orders.add(firstOrder);
        orders.add(secondOrder);

        Mockito.when(ordemRepository.listAll()).thenReturn(orders);

        Assertions.assertSame(secondOrder, ordemRepository.listAll().get(1));
    }
}
