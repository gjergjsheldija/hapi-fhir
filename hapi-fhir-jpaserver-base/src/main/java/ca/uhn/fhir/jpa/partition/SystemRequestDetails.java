package ca.uhn.fhir.jpa.partition;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.api.AddProfileTagEnum;
import ca.uhn.fhir.interceptor.api.IInterceptorBroadcaster;
import ca.uhn.fhir.interceptor.api.IInterceptorService;
import ca.uhn.fhir.rest.api.EncodingEnum;
import ca.uhn.fhir.rest.api.server.RequestDetails;
import ca.uhn.fhir.rest.server.ETagSupportEnum;
import ca.uhn.fhir.rest.server.ElementsSupportEnum;
import ca.uhn.fhir.rest.server.IPagingProvider;
import ca.uhn.fhir.rest.server.IRestfulServerDefaults;
import ca.uhn.fhir.rest.server.interceptor.IServerInterceptor;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.List;

/**
 * A default RequestDetails implementation that can be used for system calls to
 * Resource DAO methods when partitioning is enabled. Using a SystemRequestDetails
 * instance for system calls will ensure that any resource queries or updates will
 * use the DEFAULT partition when partitioninbg is enabled.
 */
public class SystemRequestDetails extends RequestDetails {
	public SystemRequestDetails(IInterceptorBroadcaster theInterceptorBroadcaster) {
		super(theInterceptorBroadcaster);
	}

	@Override
	protected byte[] getByteStreamRequestContents() {
		return new byte[0];
	}

	@Override
	public Charset getCharset() {
		return null;
	}

	@Override
	public FhirContext getFhirContext() {
		return null;
	}

	@Override
	public String getHeader(String name) {
		return null;
	}

	@Override
	public List<String> getHeaders(String name) {
		return null;
	}

	@Override
	public Object getAttribute(String theAttributeName) {
		return null;
	}

	@Override
	public void setAttribute(String theAttributeName, Object theAttributeValue) {

	}

	@Override
	public InputStream getInputStream() throws IOException {
		return null;
	}

	@Override
	public Reader getReader() throws IOException {
		return null;
	}

	@Override
	public IRestfulServerDefaults getServer() {
		return new MyRestfulServerDefaults();
	}

	@Override
	public String getServerBaseForRequest() {
		return null;
	}

	private static class MyRestfulServerDefaults implements IRestfulServerDefaults {

		@Override
		public AddProfileTagEnum getAddProfileTag() {
			return null;
		}

		@Override
		public EncodingEnum getDefaultResponseEncoding() {
			return null;
		}

		@Override
		public ETagSupportEnum getETagSupport() {
			return null;
		}

		@Override
		public ElementsSupportEnum getElementsSupport() {
			return null;
		}

		@Override
		public FhirContext getFhirContext() {
			return null;
		}

		@Override
		public List<IServerInterceptor> getInterceptors_() {
			return null;
		}

		@Override
		public IPagingProvider getPagingProvider() {
			return null;
		}

		@Override
		public boolean isDefaultPrettyPrint() {
			return false;
		}

		@Override
		public IInterceptorService getInterceptorService() {
			return null;
		}
	}
}
