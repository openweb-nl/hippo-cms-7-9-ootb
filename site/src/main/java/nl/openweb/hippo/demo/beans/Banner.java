package nl.openweb.hippo.demo.beans;
/*
 * Copyright 2014 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;

@HippoEssentialsGenerated(internalName = "ootb:bannerdocument")
@Node(jcrType = "ootb:bannerdocument")
public class Banner extends BaseDocument {
	@HippoEssentialsGenerated(internalName = "ootb:title")
	public String getTitle() {
		return getProperty("ootb:title");
	}

	@HippoEssentialsGenerated(internalName = "ootb:content")
	public HippoHtml getContent() {
		return getHippoHtml("ootb:content");
	}

	@HippoEssentialsGenerated(internalName = "ootb:image")
	public HippoGalleryImageSet getImage() {
		return getLinkedBean("ootb:image", HippoGalleryImageSet.class);
	}

	@HippoEssentialsGenerated(internalName = "ootb:link")
	public HippoBean getLink() {
		return getLinkedBean("ootb:link", HippoBean.class);
	}
}
