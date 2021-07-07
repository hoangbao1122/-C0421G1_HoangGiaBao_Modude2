package case_study.serivce.interface_all;

import case_study.model.abtract.Facility;

import java.util.Map;

public interface FacilityService extends Service {
    Map<Facility,Integer>getVilla();
    Map<Facility,Integer>getHouse();
    Map<Facility,Integer>getRoom();


}
