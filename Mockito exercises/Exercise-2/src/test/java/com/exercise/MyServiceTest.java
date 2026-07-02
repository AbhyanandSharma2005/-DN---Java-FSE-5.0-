package com.exercise;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Arrange - create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        // Act - call method
        service.fetchData();

        // Assert - verify interaction
        verify(mockApi).getData();
    }
}