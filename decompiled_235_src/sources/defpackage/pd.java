package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pd  reason: default package */
/* loaded from: classes.dex */
public class pd implements me0 {
    public final bf0 A;
    public final CameraCaptureSession B;
    public final id0 L;
    public final Handler R;

    public pd(bf0 bf0Var, CameraCaptureSession cameraCaptureSession, id0 id0Var, Handler handler) {
        bf0Var.getClass();
        id0Var.getClass();
        handler.getClass();
        this.A = bf0Var;
        this.B = cameraCaptureSession;
        this.L = id0Var;
        this.R = handler;
        uw uwVar = ig0.a;
        uwVar.getClass();
        uw.b.incrementAndGet(uwVar);
    }

    @Override // defpackage.me0
    public final boolean E() {
        double d;
        jg7 jg7Var;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        bf0 bf0Var = this.A;
        sb.append(bf0Var.h());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String h = bf0Var.h();
            id0 id0Var = this.L;
            try {
                this.B.abortCaptures();
                jg7Var = jg7.a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
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
                                } else {
                                    i = 0;
                                }
                            } else {
                                i = 6;
                            }
                        }
                        id0Var.a(h, i, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        id0Var.a(h, 9, false);
                    }
                    jg7Var = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            if (jg7Var != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.me0
    public final bf0 L() {
        return this.A;
    }

    @Override // defpackage.me0
    public final Integer Q(ArrayList arrayList, vc0 vc0Var) {
        double d;
        Integer num;
        arrayList.getClass();
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        bf0 bf0Var = this.A;
        sb.append(bf0Var.h());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String h = bf0Var.h();
            id0 id0Var = this.L;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.B.captureBurst(arrayList, vc0Var, this.R));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                            id0Var.a(h, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            id0Var.a(h, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.me0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V(List list) {
        double d;
        jg7 jg7Var;
        CameraCaptureSession cameraCaptureSession;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb = new StringBuilder("CXCP#finalizeOutputConfigurations-");
            bf0 bf0Var = this.A;
            sb.append(bf0Var.h());
            String sb2 = sb.toString();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                try {
                    Trace.beginSection(sb2);
                    String h = bf0Var.h();
                    id0 id0Var = this.L;
                    try {
                        cameraCaptureSession = this.B;
                        d = 1000000.0d;
                    } catch (Exception e) {
                        e = e;
                        d = 1000000.0d;
                    }
                    try {
                        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add((OutputConfiguration) ((xi) it.next()).e(gh5.a(OutputConfiguration.class)));
                        }
                        cameraCaptureSession.finalizeOutputConfigurations(arrayList);
                        jg7Var = jg7.a;
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                            CameraAccessException cameraAccessException = (CameraAccessException) e;
                            int reason = cameraAccessException.getReason();
                            int i = 3;
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
                                    } else {
                                        i = 0;
                                    }
                                } else {
                                    i = 6;
                                }
                            }
                            id0Var.a(h, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            id0Var.a(h, 9, false);
                        }
                        jg7Var = null;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                        if (jg7Var != null) {
                        }
                    }
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    if (jg7Var != null) {
                        return false;
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                throw th;
            }
        }
        i.m("Attempting to call finalizeOutputConfigurations before O is not supported and may lead to to unexpected behavior if an application is expects this call to succeed.");
        return false;
    }

    @Override // defpackage.me0
    public final boolean W() {
        double d;
        jg7 jg7Var;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        bf0 bf0Var = this.A;
        sb.append(bf0Var.h());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String h = bf0Var.h();
            id0 id0Var = this.L;
            try {
                this.B.stopRepeating();
                jg7Var = jg7.a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        int i = 3;
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
                                } else {
                                    i = 0;
                                }
                            } else {
                                i = 6;
                            }
                        }
                        id0Var.a(h, i, true);
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        id0Var.a(h, 9, false);
                    }
                    jg7Var = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            if (jg7Var != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    @Override // defpackage.me0
    public final Integer d0(CaptureRequest captureRequest, vc0 vc0Var) {
        double d;
        Integer num;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        bf0 bf0Var = this.A;
        sb.append(bf0Var.h());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String h = bf0Var.h();
            id0 id0Var = this.L;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.B.capture(captureRequest, vc0Var, this.R));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                            id0Var.a(h, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            id0Var.a(h, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.hh7
    public Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(CameraCaptureSession.class))) {
            return this.B;
        }
        return null;
    }

    @Override // defpackage.me0
    public final Surface getInputSurface() {
        return this.B.getInputSurface();
    }

    @Override // defpackage.me0
    public final Integer i(CaptureRequest captureRequest, vc0 vc0Var) {
        double d;
        Integer num;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        bf0 bf0Var = this.A;
        sb.append(bf0Var.h());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String h = bf0Var.h();
            id0 id0Var = this.L;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.B.setRepeatingRequest(captureRequest, vc0Var, this.R));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                            id0Var.a(h, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            id0Var.a(h, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.me0
    public final Integer o(ArrayList arrayList, vc0 vc0Var) {
        double d;
        Integer num;
        arrayList.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        bf0 bf0Var = this.A;
        sb.append(bf0Var.h());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String h = bf0Var.h();
            id0 id0Var = this.L;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.B.setRepeatingBurst(arrayList, vc0Var, this.R));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                            id0Var.a(h, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            id0Var.a(h, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", i61.p(new Object[]{Double.valueOf(i61.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", i61.r(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }
}
