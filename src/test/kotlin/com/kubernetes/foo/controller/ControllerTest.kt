package com.kubernetes.foo.controller

import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.mockito.Mock
import org.springframework.boot.test.context.SpringBootTest

// @SpringBootTest
class ControllerTest {
    // @Mock
    private lateinit var controller: FooController
    // @Test
    fun `이 테스트는 무조건 성공한다`() {
        BDDMockito.given(controller.foo()).willReturn("foo")
    }
}