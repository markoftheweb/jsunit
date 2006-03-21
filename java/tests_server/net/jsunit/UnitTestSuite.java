package net.jsunit;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.jsunit.action.*;
import net.jsunit.configuration.*;
import net.jsunit.interceptor.*;
import net.jsunit.model.*;

public class UnitTestSuite extends TestCase {

    public static TestSuite suite() {
        TestSuite result = new TestSuite();
        result.addTestSuite(ArgumentsConfigurationSourceTest.class);
        result.addTestSuite(BrowserLaunchSpecificationTest.class);
        result.addTestSuite(BrowserResultInterceptorTest.class);
        result.addTestSuite(BrowserResultLogWriterTest.class);
        result.addTestSuite(BrowserResultTest.class);
        result.addTestSuite(BrowserTest.class);
        result.addTestSuite(BrowserTestRunnerInterceptorTest.class);
        result.addTestSuite(ClientServerInteractionTest.class);
        result.addTestSuite(ClientServerConnectionTest.class);
        result.addTestSuite(ConfigurationSourceResolutionTest.class);
        result.addTestSuite(ConfigurationTest.class);
        result.addTestSuite(DistributedTestRunResultBuilderTest.class);
        result.addTestSuite(EnvironmentVariablesConfigurationSourceTest.class);
        result.addTestSuite(ErrorXmlRenderableTest.class);
        result.addTestSuite(ExternallyShutDownBrowserResultTest.class);
        result.addTestSuite(FailedToLaunchBrowserResultTest.class);
        result.addTestSuite(FarmServerConfigurationActionTest.class);
        result.addTestSuite(FarmServerInterceptorTest.class);
        result.addTestSuite(DistributedTestRunResultTest.class);
        result.addTestSuite(DistributedTestRunManagerTest.class);
        result.addTestSuite(DistributedTestRunnerActionTest.class);
        result.addTestSuite(JsUnitFarmServerTest.class);
        result.addTestSuite(JsUnitStandardServerTest.class);
        result.addTestSuite(LatestVersionActionTest.class);
        result.addTestSuite(PropertiesConfigurationSourceTest.class);
        result.addTestSuite(RemoteConfigurationSourceTest.class);
        result.addTestSuite(RemoteRunnerHitterInterceptorTest.class);
        result.addTestSuite(RemoteMachineRunnerHitterTest.class);
        result.addTestSuite(RemoteTestRunClientTest.class);
        result.addTestSuite(RequestSourceInterceptorTest.class);
        result.addTestSuite(ResultAcceptorActionTest.class);
        result.addTestSuite(ResultAcceptorTest.class);
        result.addTestSuite(ResultDisplayerActionTest.class);
        result.addTestSuite(TestRunnerActionSimultaneousRunBlockingTest.class);
        result.addTestSuite(TestRunNotifierServerTest.class);
        result.addTestSuite(TestRunResultBuilderTest.class);
        result.addTestSuite(TestCaseResultTest.class);
        result.addTestSuite(TestPageResultTest.class);
        result.addTestSuite(TestRunManagerTest.class);
        result.addTestSuite(TestRunResultTest.class);
        result.addTestSuite(TestRunnerActionTest.class);
        result.addTestSuite(TimeoutCheckerTest.class);
        result.addTestSuite(TimedOutBrowerResultTest.class);
        result.addTestSuite(VersionGrabberInterceptorTest.class);
        return result;
    }

}