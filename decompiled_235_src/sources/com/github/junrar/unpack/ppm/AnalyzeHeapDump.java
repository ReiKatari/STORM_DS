package com.github.junrar.unpack.ppm;

import com.github.junrar.rarfile.MainHeader;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AnalyzeHeapDump {
    private static final ry3 logger = sy3.d(MainHeader.class);

    public static void main(String[] strArr) {
        BufferedInputStream bufferedInputStream;
        File file = new File("P:\\test\\heapdumpc");
        File file2 = new File("P:\\test\\heapdumpj");
        if (!file.exists()) {
            logger.u(file.getAbsolutePath());
        } else if (!file2.exists()) {
            logger.u(file2.getAbsolutePath());
        } else {
            long length = file.length();
            long length2 = file2.length();
            if (length != length2) {
                ry3 ry3Var = logger;
                ry3Var.o("File size mismatch");
                ry3Var.b(Long.valueOf(length), "clen = {}");
                ry3Var.b(Long.valueOf(length2), "jlen = {}");
            }
            long min = Math.min(length, length2);
            BufferedInputStream bufferedInputStream2 = null;
            try {
                try {
                    BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(file), 262144);
                    try {
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file2), 262144);
                        long j = 0;
                        long j2 = 0;
                        boolean z = false;
                        boolean z2 = true;
                        while (j < min) {
                            try {
                                if (bufferedInputStream3.read() != bufferedInputStream.read()) {
                                    if (z2) {
                                        j2 = j;
                                        z2 = false;
                                        z = true;
                                    }
                                } else if (!z2) {
                                    printMismatch(j2, j);
                                    z2 = true;
                                }
                                j++;
                            } catch (IOException e) {
                                e = e;
                                bufferedInputStream2 = bufferedInputStream3;
                                try {
                                    logger.v("", e);
                                    bufferedInputStream2.close();
                                    bufferedInputStream.close();
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        bufferedInputStream2.close();
                                        bufferedInputStream.close();
                                    } catch (IOException e2) {
                                        logger.v("", e2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedInputStream2 = bufferedInputStream3;
                                bufferedInputStream2.close();
                                bufferedInputStream.close();
                                throw th;
                            }
                        }
                        if (!z2) {
                            printMismatch(j2, j);
                        }
                        if (!z) {
                            logger.o("Files are identical");
                        }
                        logger.o("Done");
                        bufferedInputStream3.close();
                        bufferedInputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        bufferedInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedInputStream = null;
                    }
                } catch (IOException e4) {
                    logger.v("", e4);
                }
            } catch (IOException e5) {
                e = e5;
                bufferedInputStream = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
            }
        }
    }

    private static void printMismatch(long j, long j2) {
        ry3 ry3Var = logger;
        if (ry3Var.e()) {
            ry3Var.x(Long.valueOf(j), Long.toHexString(j), Long.valueOf(j2 - j));
        }
    }
}
