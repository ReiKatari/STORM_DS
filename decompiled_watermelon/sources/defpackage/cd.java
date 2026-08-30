package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cd  reason: default package */
/* loaded from: classes.dex */
public final class cd implements sc0 {
    public final ce0 A;
    public final CameraDevice B;
    public final String L;
    public final ab0 R;
    public final q03 X;
    public final ct6 Y;
    public final aw Z;
    public final fw c0;

    public cd(ce0 ce0Var, CameraDevice cameraDevice, String str, ab0 ab0Var, q03 q03Var, ct6 ct6Var) {
        ce0Var.getClass();
        str.getClass();
        ab0Var.getClass();
        ct6Var.getClass();
        this.A = ce0Var;
        this.B = cameraDevice;
        this.L = str;
        this.R = ab0Var;
        this.X = q03Var;
        this.Y = ct6Var;
        this.Z = w81.e(false);
        this.c0 = w81.g(null);
    }

    @Override // defpackage.sc0
    public final CaptureRequest.Builder B(TotalCaptureResult totalCaptureResult) {
        double d;
        CaptureRequest.Builder builder;
        StringBuilder sb = new StringBuilder("CXCP#createReprocessCaptureRequest-");
        String str = this.L;
        sb.append(str);
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            ab0 ab0Var = this.R;
            try {
                builder = this.B.createReprocessCaptureRequest(totalCaptureResult);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason != 1) {
                            if (reason != 2) {
                                if (reason != 3) {
                                    if (reason != 4) {
                                        if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    } else {
                                        i = 1;
                                    }
                                }
                            } else {
                                i = 6;
                            }
                        } else {
                            i = 3;
                        }
                        ab0Var.a(str, i, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        ab0Var.a(str, 9, false);
                    }
                    builder = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            return builder;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6 A[Catch: all -> 0x00ab, TryCatch #4 {all -> 0x00ab, blocks: (B:22:0x009c, B:30:0x00b2, B:32:0x00b6, B:41:0x00e3, B:47:0x0102, B:50:0x0108, B:52:0x010c, B:54:0x0110, B:56:0x0114, B:59:0x0119, B:61:0x011d, B:62:0x0123, B:63:0x0124), top: B:79:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[Catch: all -> 0x00ab, TryCatch #4 {all -> 0x00ab, blocks: (B:22:0x009c, B:30:0x00b2, B:32:0x00b6, B:41:0x00e3, B:47:0x0102, B:50:0x0108, B:52:0x010c, B:54:0x0110, B:56:0x0114, B:59:0x0119, B:61:0x011d, B:62:0x0123, B:63:0x0124), top: B:79:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    @Override // defpackage.sc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(defpackage.g03 r23, java.util.ArrayList r24, defpackage.cc0 r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.C(g03, java.util.ArrayList, cc0):boolean");
    }

    @Override // defpackage.sc0
    public final void D() {
        if (this.Z.b()) {
            l16 l16Var = (l16) this.c0.b(null);
            if (l16Var != null) {
                c(l16Var);
                return;
            }
            return;
        }
        i.n("Check failed.");
    }

    @Override // defpackage.sc0
    public final void F(int i) {
        try {
            Trace.beginSection("setCameraAudioRestriction");
            String str = this.L;
            ab0 ab0Var = this.R;
            try {
                this.B.setCameraAudioRestriction(i);
            } catch (Exception e) {
                int i2 = 0;
                if (e instanceof CameraAccessException) {
                    Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                    CameraAccessException cameraAccessException = (CameraAccessException) e;
                    int reason = cameraAccessException.getReason();
                    if (reason != 1) {
                        if (reason != 2) {
                            if (reason != 3) {
                                if (reason != 4) {
                                    if (reason != 5) {
                                        Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                        i2 = 11;
                                    } else {
                                        i2 = 2;
                                    }
                                } else {
                                    i2 = 1;
                                }
                            }
                        } else {
                            i2 = 6;
                        }
                    } else {
                        i2 = 3;
                    }
                    ab0Var.a(str, i2, true);
                } else {
                    if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (e instanceof IllegalStateException) {
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        } else {
                            throw e;
                        }
                    }
                    Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                    ab0Var.a(str, 9, false);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.sc0
    public final void J() {
        l16 l16Var;
        if (this.Z.a() && (l16Var = (l16) this.c0.a) != null) {
            b(l16Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[Catch: all -> 0x00b7, TryCatch #2 {all -> 0x00b7, blocks: (B:25:0x0096, B:27:0x00a1, B:29:0x00a7, B:31:0x00b3, B:36:0x00bd, B:37:0x00c4, B:38:0x00c5, B:46:0x00d9, B:48:0x00dd, B:57:0x010a, B:63:0x0129, B:66:0x012f, B:68:0x0133, B:70:0x0137, B:72:0x013b, B:75:0x0140, B:77:0x0144, B:78:0x014a, B:79:0x014b), top: B:95:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f A[Catch: all -> 0x00b7, TryCatch #2 {all -> 0x00b7, blocks: (B:25:0x0096, B:27:0x00a1, B:29:0x00a7, B:31:0x00b3, B:36:0x00bd, B:37:0x00c4, B:38:0x00c5, B:46:0x00d9, B:48:0x00dd, B:57:0x010a, B:63:0x0129, B:66:0x012f, B:68:0x0133, B:70:0x0137, B:72:0x013b, B:75:0x0140, B:77:0x0144, B:78:0x014a, B:79:0x014b), top: B:95:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a9  */
    @Override // defpackage.sc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean R(defpackage.s32 r26) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.R(s32):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019a A[Catch: all -> 0x00be, TryCatch #10 {all -> 0x00be, blocks: (B:27:0x00a4, B:29:0x00b0, B:31:0x00b6, B:36:0x00c7, B:39:0x00f2, B:40:0x0115, B:42:0x011b, B:43:0x0129, B:44:0x0133, B:46:0x0139, B:48:0x014b, B:50:0x0158, B:51:0x015c, B:53:0x016e, B:56:0x0178, B:57:0x017b, B:59:0x017d, B:60:0x0180, B:69:0x0196, B:71:0x019a, B:80:0x01c7, B:88:0x01ec, B:90:0x01f1, B:92:0x01f7, B:94:0x01fb, B:96:0x01ff, B:99:0x0204, B:101:0x0208, B:102:0x020e, B:103:0x020f), top: B:121:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1 A[Catch: all -> 0x00be, TryCatch #10 {all -> 0x00be, blocks: (B:27:0x00a4, B:29:0x00b0, B:31:0x00b6, B:36:0x00c7, B:39:0x00f2, B:40:0x0115, B:42:0x011b, B:43:0x0129, B:44:0x0133, B:46:0x0139, B:48:0x014b, B:50:0x0158, B:51:0x015c, B:53:0x016e, B:56:0x0178, B:57:0x017b, B:59:0x017d, B:60:0x0180, B:69:0x0196, B:71:0x019a, B:80:0x01c7, B:88:0x01ec, B:90:0x01f1, B:92:0x01f7, B:94:0x01fb, B:96:0x01ff, B:99:0x0204, B:101:0x0208, B:102:0x020e, B:103:0x020f), top: B:121:0x003b }] */
    @Override // defpackage.sc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T(defpackage.g16 r26) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.T(g16):boolean");
    }

    @Override // defpackage.sc0
    public final CaptureRequest.Builder V(int i) {
        double d;
        CaptureRequest.Builder builder;
        StringBuilder sb = new StringBuilder("CXCP#createCaptureRequest-");
        String str = this.L;
        sb.append(str);
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            ab0 ab0Var = this.R;
            try {
                builder = this.B.createCaptureRequest(i);
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                int i2 = 0;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason != 1) {
                            if (reason != 2) {
                                if (reason != 3) {
                                    if (reason != 4) {
                                        if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i2 = 11;
                                        } else {
                                            i2 = 2;
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                }
                            } else {
                                i2 = 6;
                            }
                        } else {
                            i2 = 3;
                        }
                        ab0Var.a(str, i2, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        ab0Var.a(str, 9, false);
                    }
                    builder = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            return builder;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    @Override // defpackage.sc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z(java.util.ArrayList r26, defpackage.cc0 r27) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.Z(java.util.ArrayList, cc0):boolean");
    }

    public final ti4 a(l16 l16Var) {
        if (this.Z.b()) {
            c(l16Var);
            return new ti4(Boolean.FALSE, null);
        }
        return new ti4(Boolean.TRUE, this.c0.b(l16Var));
    }

    public final void b(l16 l16Var) {
        try {
            Trace.beginSection(this + "#onSessionDisconnected");
            l16Var.c();
        } finally {
            Trace.endSection();
        }
    }

    public final void c(l16 l16Var) {
        try {
            Trace.beginSection(this + "#onSessionFinalized");
            l16Var.b();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    @Override // defpackage.sc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.util.List r26, defpackage.cc0 r27) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.d(java.util.List, cc0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:21:0x008d, B:30:0x00a6, B:32:0x00aa, B:41:0x00d6, B:47:0x00f6, B:49:0x00fb, B:51:0x0101, B:53:0x0105, B:55:0x0109, B:58:0x010e, B:60:0x0112, B:61:0x0118, B:62:0x0119), top: B:75:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb A[Catch: all -> 0x009d, TryCatch #3 {all -> 0x009d, blocks: (B:21:0x008d, B:30:0x00a6, B:32:0x00aa, B:41:0x00d6, B:47:0x00f6, B:49:0x00fb, B:51:0x0101, B:53:0x0105, B:55:0x0109, B:58:0x010e, B:60:0x0112, B:61:0x0118, B:62:0x0119), top: B:75:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    @Override // defpackage.sc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.util.ArrayList r22, defpackage.cc0 r23) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.i(java.util.ArrayList, cc0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    @Override // defpackage.sc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j0(android.hardware.camera2.params.InputConfiguration r26, java.util.ArrayList r27, defpackage.cc0 r28) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.j0(android.hardware.camera2.params.InputConfiguration, java.util.ArrayList, cc0):boolean");
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(CameraDevice.class))) {
            return this.B;
        }
        return null;
    }

    public final String toString() {
        return "AndroidCameraDevice(camera=" + ((Object) od0.b(this.L)) + ')';
    }

    @Override // defpackage.sc0
    public final String w() {
        return this.L;
    }
}
