package com.ruyjfs.microservicepostgresdb.service;

import com.ruyjfs.microservicepostgresdb.model.User;
import com.ruyjfs.microservicepostgresdb.repository.UserRepository;
import com.ruyjfs.microservicepostgresdb.template.UserTemplate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;

@Configuration
@EnableAutoConfiguration
public class UserServiceTest {

    @InjectMocks
    private UserService service;

    @Mock
    private UserRepository repository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    private final UserTemplate userTemplate = UserTemplate.getInstance();

    @Test
    public void test_GetAll_NOK() {
        var data = service.getAll();

        Mockito.when(service.getAll()).thenReturn(null);
//        FormField formField =
//                formFieldTemplate.getFormField("campaignName", FormFieldValidationType.REQUIRED, "true");
//        FormField result = service.save(formField);
//
//        Mockito.when(service.save(formField)).thenReturn(formField);
//        assertThat(result).isNull();
    }

    @Test
    public void test_GetAll_OK() {
        var list = userTemplate.getList();

        Mockito.when(service.getAll()).thenReturn(list);
        Iterable<User> result = service.getAll();

        assertThat(result).isEqualTo(list);
    }

    @Test
    public void test_Save_OK() {
        var data = userTemplate.getOne();

        Mockito.when(service.save(data)).thenReturn(data);
        User result = service.save(data);

        assertThat(result).isEqualTo(data);
    }

    @Test
    public void test_Save_NOK() {
        var data = userTemplate.getOneInvalid();

        Mockito.when(service.save(data)).thenReturn(data);
        User result = service.save(data);

        assertThat(result).isEqualTo(data);
    }

//    @Test
//    public void test_Save_OK() {
//        var data = service.getAll();
//
//        Mockito.when(service.getAll()).thenReturn(null);
////        FormField formField =
////                formFieldTemplate.getFormField("campaignName", FormFieldValidationType.REQUIRED, "true");
////        FormField result = service.save(formField);
////
////        Mockito.when(service.save(formField)).thenReturn(formField);
////        assertThat(result).isNull();
//    }
}
