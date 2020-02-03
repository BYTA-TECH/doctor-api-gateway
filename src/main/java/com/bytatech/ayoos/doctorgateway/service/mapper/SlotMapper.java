package com.bytatech.ayoos.doctorgateway.service.mapper;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.*;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Slot} and its DTO {@link SlotDTO}.
 */
@Mapper(componentModel = "spring", uses = {DoctorMapper.class})
public interface SlotMapper extends EntityMapper<SlotDTO, Slot> {

    @Mapping(source = "doctor.id", target = "doctorId")
    SlotDTO toDto(Slot slot);

    @Mapping(target = "statuses", ignore = true)
    @Mapping(target = "removeStatus", ignore = true)
    @Mapping(source = "doctorId", target = "doctor")
    Slot toEntity(SlotDTO slotDTO);

    default Slot fromId(Long id) {
        if (id == null) {
            return null;
        }
        Slot slot = new Slot();
        slot.setId(id);
        return slot;
    }
}
