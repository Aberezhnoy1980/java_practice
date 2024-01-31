package ru.aberezhnoy.vetclinic.factory;

import ru.aberezhnoy.vetclinic.repository.Repository;
import ru.aberezhnoy.vetclinic.repository.RepositoryImpl;
import ru.aberezhnoy.vetclinic.vetservice.VeterinaryClinic;
import ru.aberezhnoy.vetclinic.vetservice.impl.VeterinaryClinicImpl;

public class Factory {
    public static VeterinaryClinic getVetService() {
        return VeterinaryClinicImpl.getInstance();
    }

    public static Repository getRepository() {
        return RepositoryImpl.getInstance();
    }
}
