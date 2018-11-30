import com.jetbrains.cidr.cpp.cmake.model.CMakeConfiguration;
import com.jetbrains.cidr.cpp.cmake.model.CMakeTarget;
import com.jetbrains.cidr.cpp.execution.CMakeTargetRunConfigurationBinder;
import com.jetbrains.cidr.cpp.execution.testing.CMakeTestRunConfiguration;
import com.jetbrains.cidr.execution.testing.CidrTestScopeElement;
import com.jetbrains.cidr.execution.testing.CidrTestWithScopeElementsRunConfigurationProducer;
import com.jetbrains.cidr.execution.testing.tcatch.CidrCatchTestFramework;

// analogous to com.jetbrains.cidr.cpp.execution.testing.tcatch.CMakeCatchTestRunConfigurationProducer

public class CMakeRunPatcherCatchTestRunConfigurationProducer extends CidrTestWithScopeElementsRunConfigurationProducer<CMakeConfiguration, CMakeTarget, CMakeTestRunConfiguration, CidrTestScopeElement, CidrCatchTestFramework> {
    public CMakeRunPatcherCatchTestRunConfigurationProducer() {
        super(CMakeRunPatcherCatchTestRunConfigurationType.getInstance(), CMakeTargetRunConfigurationBinder.INSTANCE, CidrCatchTestFramework.class);
    }
}
