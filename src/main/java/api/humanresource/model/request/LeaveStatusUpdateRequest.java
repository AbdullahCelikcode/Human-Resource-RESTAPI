package api.humanresource.model.request;

import api.humanresource.model.enums.LeaveStatus;
import jakarta.validation.constraints.NotNull;

public class LeaveStatusUpdateRequest {
    @NotNull
    private Long id;
    @NotNull
    private LeaveStatus leaveStatus;

    public Long getId() {
        return id;
    }

    public LeaveStatus getStatus() {
        return leaveStatus;
    }
}
