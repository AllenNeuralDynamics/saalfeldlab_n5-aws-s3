/*-
 * #%L
 * N5 AWS S3
 * %%
 * Copyright (C) 2017 - 2022, Saalfeld Lab
 * %%
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * #L%
 */
package org.janelia.saalfeldlab.n5.s3.mock;

import org.janelia.saalfeldlab.n5.s3.AbstractN5AmazonS3ContainerPathTest;
/**
 * Initiates testing of the Amazon Web Services S3-based N5 implementation using S3 mock library.
 * A non-trivial container path is used to create the test N5 container in the temporary bucket.
 *
 * @author Igor Pisarev &lt;pisarevi@janelia.hhmi.org&gt;
 */
public class N5AmazonS3ContainerPathMockTest extends AbstractN5AmazonS3ContainerPathTest {

    public N5AmazonS3ContainerPathMockTest() {

        super(MockS3Factory.getOrCreateS3());
    }
}
