package casestudy.repository;

import casestudy.model.Facility;

import java.util.Map;

public interface IFacilityRepository{
    public void add(Facility facility);
    public Map<Facility,Integer> getList();
}
