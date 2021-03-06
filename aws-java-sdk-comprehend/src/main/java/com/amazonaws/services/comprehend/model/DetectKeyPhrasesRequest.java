/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DetectKeyPhrases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectKeyPhrasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend detects
     * the dominant language. If you specify the code for a language that Amazon Comprehend does not support, it returns
     * and <code>UnsupportedLanguageException</code>. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * 
     * @param text
     *        A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * 
     * @return A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * </p>
     * 
     * @param text
     *        A UTF-8 text string. Each string must contain fewer that 5,000 bytes of UTF-8 encoded characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectKeyPhrasesRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend detects
     * the dominant language. If you specify the code for a language that Amazon Comprehend does not support, it returns
     * and <code>UnsupportedLanguageException</code>. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @param languageCode
     *        The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend
     *        detects the dominant language. If you specify the code for a language that Amazon Comprehend does not
     *        support, it returns and <code>UnsupportedLanguageException</code>. For more information about RFC 5646,
     *        see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF
     *        Tools</i> web site.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend detects
     * the dominant language. If you specify the code for a language that Amazon Comprehend does not support, it returns
     * and <code>UnsupportedLanguageException</code>. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @return The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend
     *         detects the dominant language. If you specify the code for a language that Amazon Comprehend does not
     *         support, it returns and <code>UnsupportedLanguageException</code>. For more information about RFC 5646,
     *         see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF
     *         Tools</i> web site.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend detects
     * the dominant language. If you specify the code for a language that Amazon Comprehend does not support, it returns
     * and <code>UnsupportedLanguageException</code>. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @param languageCode
     *        The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend
     *        detects the dominant language. If you specify the code for a language that Amazon Comprehend does not
     *        support, it returns and <code>UnsupportedLanguageException</code>. For more information about RFC 5646,
     *        see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF
     *        Tools</i> web site.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DetectKeyPhrasesRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend detects
     * the dominant language. If you specify the code for a language that Amazon Comprehend does not support, it returns
     * and <code>UnsupportedLanguageException</code>. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @param languageCode
     *        The RFC 5646 language code for the input text. If you don't specify a language code, Amazon Comprehend
     *        detects the dominant language. If you specify the code for a language that Amazon Comprehend does not
     *        support, it returns and <code>UnsupportedLanguageException</code>. For more information about RFC 5646,
     *        see <a href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF
     *        Tools</i> web site.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public DetectKeyPhrasesRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getText() != null)
            sb.append("Text: ").append(getText()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectKeyPhrasesRequest == false)
            return false;
        DetectKeyPhrasesRequest other = (DetectKeyPhrasesRequest) obj;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public DetectKeyPhrasesRequest clone() {
        return (DetectKeyPhrasesRequest) super.clone();
    }

}
