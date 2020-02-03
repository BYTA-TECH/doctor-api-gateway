package com.bytatech.ayoos.doctorgateway.service.mapper;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.*;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DoctorSettings} and its DTO {@link DoctorSettingsDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface DoctorSettingsMapper extends EntityMapper<DoctorSettingsDTO, DoctorSettings> {



    default DoctorSettings fromId(Long id) {
        if (id == null) {
            return null;
        }
        DoctorSettings doctorSettings = new DoctorSettings();
        doctorSettings.setId(id);
        return doctorSettings;
    }
}
