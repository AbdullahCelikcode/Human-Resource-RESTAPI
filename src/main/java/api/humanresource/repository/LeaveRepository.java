package api.humanresource.repository;

import api.humanresource.model.entity.LeaveEntity;
import api.humanresource.model.enums.LeaveStatus;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface LeaveRepository {

    void save(LeaveEntity leaveEntity);
    void update(LeaveEntity leaveEntity);


    List<LeaveEntity> findLeavesByEmployeeId(String employeeId);

    Optional<LeaveEntity> findLeavesById(Long id);

    boolean isExistByDate(LocalDate startDate, LocalDate finishDate, String employeeId);

    List<LeaveEntity> findLeavesByStatus(LeaveStatus leaveStatus);



}
