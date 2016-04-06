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
import java.util.Calendar;
import java.util.List;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.components.model.Authors;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "outofboxhippo:blogpost")
@Node(jcrType = "outofboxhippo:blogpost")
public class Blogpost extends HippoDocument implements Authors {

    public static final String TITLE = "outofboxhippo:title";
    public static final String INTRODUCTION = "outofboxhippo:introduction";
    public static final String CONTENT = "outofboxhippo:content";
    public static final String PUBLICATION_DATE = "outofboxhippo:publicationdate";
    public static final String CATEGORIES = "outofboxhippo:categories";
    public static final String AUTHOR = "outofboxhippo:author";
    public static final String AUTHOR_NAMES = "outofboxhippo:authornames";
    public static final String LINK = "outofboxhippo:link";
    public static final String AUTHORS = "outofboxhippo:authors";
    public static final String TAGS = "hippostd:tags";


   @HippoEssentialsGenerated(internalName = "outofboxhippo:publicationdate")
    public Calendar getPublicationDate() {
        return getProperty(PUBLICATION_DATE);
    }

    @HippoEssentialsGenerated(internalName = "outofboxhippo:authornames")
    public String[] getAuthorNames() {
        return getProperty(AUTHOR_NAMES);
    }

    public String getAuthor() {
        final String[] authorNames = getAuthorNames();
        if(authorNames !=null && authorNames.length > 0){
            return authorNames[0];
        }
        return null;
    }


    @HippoEssentialsGenerated(internalName = "outofboxhippo:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    @HippoEssentialsGenerated(internalName = "outofboxhippo:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    @HippoEssentialsGenerated(internalName = "outofboxhippo:introduction")
    public String getIntroduction() {
        return getProperty(INTRODUCTION);
    }


    @HippoEssentialsGenerated(internalName = "outofboxhippo:link")
    public String getLink() {
        return getProperty(LINK);
    }

    @HippoEssentialsGenerated(internalName = "outofboxhippo:categories")
    public String[] getCategories() {
        return getProperty(CATEGORIES);
    }

    @Override
    @HippoEssentialsGenerated(internalName = "outofboxhippo:authors")
    public List<Author> getAuthors() {
        return getLinkedBeans(AUTHORS, Author.class);
    }
}