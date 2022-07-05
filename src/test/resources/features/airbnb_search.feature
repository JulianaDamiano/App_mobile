Feature: Bpuequeda en Airbnb

  @test
  Scenario: Búsqueda simple de hospedaje

    Given que em encuentro en el login de Airbnb
    When busco "Cancún, Mexico"
    Then muestra el texto "Over 1,000 stays"
