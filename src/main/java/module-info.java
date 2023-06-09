/*-
 * #%L
 * Proof Utility Library
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2014 - 2023 Live Ontologies Project
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
open module org.liveontologies.puli {

	requires com.google.common;

	requires org.slf4j;

	requires org.semanticweb.owlapi;

	exports org.liveontologies.owlapi.proof;
	exports org.liveontologies.puli;
	exports org.liveontologies.puli.collections;
	exports org.liveontologies.puli.pinpointing;
	exports org.liveontologies.puli.statistics;

}
