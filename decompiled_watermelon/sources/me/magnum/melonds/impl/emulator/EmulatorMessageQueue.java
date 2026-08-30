package me.magnum.melonds.impl.emulator;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class EmulatorMessageQueue {
    public final a31 a;
    public final HandlerThread b;
    public final Handler c;
    public ParcelFileDescriptor d;
    public FileInputStream e;
    public boolean f;
    public final ByteBuffer g;
    public final ByteBuffer h;

    public EmulatorMessageQueue(a31 a31Var) {
        this.a = a31Var;
        HandlerThread handlerThread = new HandlerThread("EmulatorMessageQueue");
        handlerThread.start();
        this.b = handlerThread;
        this.c = new Handler(handlerThread.getLooper());
        this.g = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder());
        this.h = ByteBuffer.allocateDirect(128).order(ByteOrder.nativeOrder());
    }

    private static final native void closeMessagePipe();

    public static final native int initMessagePipe();

    public final void b() {
        wr1 wr1Var;
        Object obj;
        Object obj2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        vz4 vz4Var;
        boolean z;
        int i6;
        xz4 xz4Var;
        Object obj3;
        wz4 wz4Var;
        FileInputStream fileInputStream = this.e;
        if (fileInputStream != null) {
            this.g.clear();
            int read = fileInputStream.getChannel().read(this.g);
            this.g.position(0);
            if (read >= 8) {
                int i7 = this.g.getInt();
                int i8 = this.g.getInt();
                if (i8 > 0) {
                    this.h.position(0);
                    this.h.limit(i8);
                    int read2 = fileInputStream.getChannel().read(this.h);
                    this.h.position(0);
                    if (read2 < i8) {
                        return;
                    }
                }
                Iterator<E> it = as1.getEntries().iterator();
                while (true) {
                    wr1Var = null;
                    wz4Var = null;
                    wz4Var = null;
                    wz4Var = null;
                    xz4Var = null;
                    xz4Var = null;
                    xz4Var = null;
                    xz4Var = null;
                    xz4Var = null;
                    vz4Var = null;
                    vz4Var = null;
                    vz4Var = null;
                    vz4Var = null;
                    obj2 = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((as1) obj).getEvent() == i7) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                as1 as1Var = (as1) obj;
                if (as1Var != null) {
                    a31 a31Var = this.a;
                    ByteBuffer byteBuffer = this.h;
                    byteBuffer.getClass();
                    xg xgVar = (xg) a31Var.B;
                    boolean z2 = true;
                    int i9 = 32;
                    switch (ig.a[as1Var.ordinal()]) {
                        case 1:
                            xgVar.k.p(new ur1(byteBuffer.getInt()));
                            return;
                        case 2:
                            xgVar.k.p(vr1.a);
                            return;
                        case 3:
                            int i10 = byteBuffer.getInt();
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 == 4) {
                                        wr1Var = wr1.PowerOff;
                                    }
                                } else {
                                    wr1Var = wr1.BadExceptionRegion;
                                }
                            } else {
                                wr1Var = wr1.GBAModeNotSupported;
                            }
                            if (wr1Var != null) {
                                xgVar.k.p(new xr1(wr1Var));
                                return;
                            }
                            return;
                        case 4:
                            int i11 = byteBuffer.getInt();
                            Iterator<E> it2 = VideoRenderer.getEntries().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (((VideoRenderer) next).getRenderer() == i11) {
                                        obj2 = next;
                                    }
                                }
                            }
                            VideoRenderer videoRenderer = (VideoRenderer) obj2;
                            if (videoRenderer != null) {
                                xgVar.k.p(new tr1(videoRenderer));
                                return;
                            }
                            return;
                        case 5:
                            xgVar.k.p(new yr1(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt()));
                            return;
                        case ig7.b /* 6 */:
                            xgVar.m.p(new fz4(byteBuffer.getLong()));
                            return;
                        case 7:
                            xgVar.m.p(new iz4(byteBuffer.getLong()));
                            return;
                        case 8:
                            xgVar.m.p(new jz4(byteBuffer.getLong()));
                            return;
                        case 9:
                            long j = byteBuffer.getLong();
                            int i12 = byteBuffer.getInt();
                            int i13 = byteBuffer.getInt();
                            if (byteBuffer.remaining() >= 4) {
                                i = byteBuffer.getInt();
                            } else {
                                i = 0;
                            }
                            int remaining = byteBuffer.remaining();
                            if (32 > remaining) {
                                i9 = remaining;
                            }
                            byte[] bArr = new byte[i9];
                            byteBuffer.get(bArr);
                            if (i < 0) {
                                i = 0;
                            }
                            if (i <= i9) {
                                i9 = i;
                            }
                            xgVar.m.p(new hz4(i12, i13, j, new String(bArr, 0, i9, hk0.a)));
                            return;
                        case 10:
                            xgVar.m.p(new lz4(byteBuffer.getLong()));
                            return;
                        case 11:
                            xgVar.m.p(new a05(byteBuffer.getLong()));
                            return;
                        case mj2.L /* 12 */:
                            xgVar.m.p(new zz4(byteBuffer.getInt(), byteBuffer.getLong(), k45.m(32, byteBuffer), k45.m(64, byteBuffer)));
                            return;
                        case 13:
                            xgVar.m.p(kz4.a);
                            return;
                        case 14:
                            xgVar.m.p(yz4.a);
                            return;
                        case ig7.e /* 15 */:
                            long j2 = byteBuffer.getLong();
                            long j3 = byteBuffer.getLong();
                            long j4 = byteBuffer.getLong();
                            oz4 oz4Var = new oz4(j2, j3, j4);
                            xgVar.q.j(j2, j3);
                            xgVar.e("STARTED", j2, j3, j4, "");
                            xgVar.m.p(oz4Var);
                            return;
                        case 16:
                            long j5 = byteBuffer.getLong();
                            long j6 = byteBuffer.getLong();
                            long j7 = byteBuffer.getLong();
                            if (byteBuffer.getInt() == 0) {
                                z2 = false;
                            }
                            if (byteBuffer.remaining() >= 4) {
                                i2 = byteBuffer.getInt();
                            } else {
                                i2 = 0;
                            }
                            int remaining2 = byteBuffer.remaining();
                            if (32 > remaining2) {
                                i9 = remaining2;
                            }
                            byte[] bArr2 = new byte[i9];
                            byteBuffer.get(bArr2);
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            if (i2 <= i9) {
                                i9 = i2;
                            }
                            String str = new String(bArr2, 0, i9, hk0.a);
                            boolean z3 = z2;
                            qz4 qz4Var = new qz4(j5, j6, j7, str, z3);
                            ac1 ac1Var = xgVar.q;
                            if (z3) {
                                ac1Var.j(j5, j6);
                                xgVar.e("TRACKER_SHOW", j5, j6, j7, "tracker_display=".concat(str));
                            } else {
                                zl3 h = ac1Var.h(j5, j6);
                                if (h.a) {
                                    xgVar.e("TRACKER_UPDATE", j5, j6, j7, "tracker_display=" + str + " tracker_update_index=" + h.b + " suppressed_updates=" + h.c);
                                }
                            }
                            xgVar.m.p(qz4Var);
                            return;
                        case 17:
                            long j8 = byteBuffer.getLong();
                            long j9 = byteBuffer.getLong();
                            long j10 = byteBuffer.getLong();
                            mz4 mz4Var = new mz4(j8, j9, j10);
                            xgVar.q.j(j8, j9);
                            xgVar.e("CANCELED", j8, j9, j10, "");
                            xgVar.m.p(mz4Var);
                            return;
                        case 18:
                            long j11 = byteBuffer.getLong();
                            int i14 = byteBuffer.getInt();
                            if (byteBuffer.remaining() >= 4) {
                                i3 = byteBuffer.getInt();
                            } else {
                                i3 = 0;
                            }
                            int remaining3 = byteBuffer.remaining();
                            if (32 > remaining3) {
                                i9 = remaining3;
                            }
                            byte[] bArr3 = new byte[i9];
                            byteBuffer.get(bArr3);
                            if (i3 < 0) {
                                i3 = 0;
                            }
                            if (i3 <= i9) {
                                i9 = i3;
                            }
                            xgVar.m.p(new nz4(new String(bArr3, 0, i9, hk0.a), i14, j11));
                            return;
                        case 19:
                            xgVar.m.p(new gz4(byteBuffer.getLong()));
                            return;
                        case 20:
                            long j12 = byteBuffer.getLong();
                            long j13 = byteBuffer.getLong();
                            long j14 = byteBuffer.getLong();
                            uz4 uz4Var = new uz4(j12, j13, j14);
                            xgVar.q.j(j12, j13);
                            xgVar.e("TRACKER_HIDE", j12, j13, j14, "");
                            xgVar.m.p(uz4Var);
                            return;
                        case 21:
                            long j15 = byteBuffer.getLong();
                            long j16 = byteBuffer.getLong();
                            long j17 = byteBuffer.getLong();
                            if (byteBuffer.remaining() >= 4) {
                                i4 = byteBuffer.getInt();
                            } else {
                                i4 = 0;
                            }
                            int remaining4 = byteBuffer.remaining();
                            if (32 > remaining4) {
                                i9 = remaining4;
                            }
                            byte[] bArr4 = new byte[i9];
                            byteBuffer.get(bArr4);
                            if (i4 < 0) {
                                i4 = 0;
                            }
                            if (i4 <= i9) {
                                i9 = i4;
                            }
                            String str2 = new String(bArr4, 0, i9, hk0.a);
                            pz4 pz4Var = new pz4(j15, j16, j17, str2);
                            xgVar.e("SUBMITTED", j15, j16, j17, "tracker_display=".concat(str2));
                            xgVar.m.p(pz4Var);
                            return;
                        case 22:
                            long j18 = byteBuffer.getLong();
                            long j19 = byteBuffer.getLong();
                            long j20 = byteBuffer.getLong();
                            long j21 = byteBuffer.getInt() & 4294967295L;
                            long j22 = byteBuffer.getInt() & 4294967295L;
                            String m = k45.m(32, byteBuffer);
                            String m2 = k45.m(32, byteBuffer);
                            sz4 sz4Var = new sz4(j18, j19, j20, m, m2, j21, j22);
                            xgVar.q.j(j18, j19);
                            StringBuilder v = b31.v("submitted_score=", m, " best_score=", m2, " rank=");
                            v.append(j21);
                            v.append(" num_entries=");
                            v.append(j22);
                            xgVar.e("SCOREBOARD", j18, j19, j20, v.toString());
                            xgVar.m.p(sz4Var);
                            return;
                        case 23:
                            long j23 = byteBuffer.getLong();
                            long j24 = byteBuffer.getLong();
                            long j25 = byteBuffer.getLong();
                            int i15 = byteBuffer.getInt();
                            if (byteBuffer.remaining() >= 4) {
                                i5 = byteBuffer.getInt();
                            } else {
                                i5 = 0;
                            }
                            int remaining5 = byteBuffer.remaining();
                            if (48 <= remaining5) {
                                remaining5 = 48;
                            }
                            byte[] bArr5 = new byte[remaining5];
                            byteBuffer.get(bArr5);
                            if (i5 < 0) {
                                i5 = 0;
                            }
                            if (i5 <= remaining5) {
                                remaining5 = i5;
                            }
                            tz4 tz4Var = new tz4(j23, j24, j25, i15, new String(bArr5, 0, remaining5, hk0.a));
                            xgVar.q.j(j23, j24);
                            xgVar.e("SERVER_ERROR", j23, j24, j25, wh1.g(i15, "result="));
                            xgVar.m.p(tz4Var);
                            return;
                        case 24:
                            long j26 = byteBuffer.getLong();
                            rz4 rz4Var = new rz4(j26);
                            xgVar.q.k();
                            if (xgVar.p) {
                                Log.i("RASubmission", "event_type=jni_event_received jni_event=RUNTIME_RESET attempt_floor=" + j26);
                            }
                            xgVar.m.p(rz4Var);
                            return;
                        case 25:
                            if (byteBuffer.remaining() >= 104) {
                                long j27 = byteBuffer.getLong();
                                long j28 = byteBuffer.getLong();
                                if (j27 > 0 && j28 > 0) {
                                    long j29 = byteBuffer.getLong();
                                    long j30 = byteBuffer.getLong();
                                    long j31 = byteBuffer.getLong();
                                    long j32 = byteBuffer.getLong();
                                    long j33 = byteBuffer.getLong();
                                    x25 x25Var = y25.Companion;
                                    int i16 = byteBuffer.getInt();
                                    x25Var.getClass();
                                    y25 a = x25.a(i16);
                                    if (a != null) {
                                        int i17 = byteBuffer.getInt();
                                        if (byteBuffer.getInt() != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (byteBuffer.remaining() >= 4) {
                                            i6 = byteBuffer.getInt();
                                        } else {
                                            i6 = 0;
                                        }
                                        int remaining6 = byteBuffer.remaining();
                                        if (32 > remaining6) {
                                            i9 = remaining6;
                                        }
                                        byte[] bArr6 = new byte[i9];
                                        byteBuffer.get(bArr6);
                                        if (i6 < 0) {
                                            i6 = 0;
                                        }
                                        if (i6 <= i9) {
                                            i9 = i6;
                                        }
                                        vz4Var = new vz4(j27, j28, j29, j30, a, j31, j32, j33, i17, z, new String(bArr6, 0, i9, hk0.a));
                                    }
                                }
                            }
                            if (vz4Var != null) {
                                xgVar.m.p(vz4Var);
                                return;
                            }
                            return;
                        case 26:
                            if (byteBuffer.remaining() >= 28) {
                                long j34 = byteBuffer.getLong();
                                long j35 = byteBuffer.getLong();
                                if (j34 > 0 && j35 > 0) {
                                    x25 x25Var2 = y25.Companion;
                                    int i18 = byteBuffer.getInt();
                                    x25Var2.getClass();
                                    y25 a2 = x25.a(i18);
                                    if (a2 != null) {
                                        v25 v25Var = w25.Companion;
                                        int i19 = byteBuffer.getInt();
                                        v25Var.getClass();
                                        Iterator<E> it3 = w25.getEntries().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                if (((w25) obj3).getWireValue() == i19) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        w25 w25Var = (w25) obj3;
                                        if (w25Var != null) {
                                            xz4Var = new xz4(j34, j35, a2, w25Var, byteBuffer.getInt());
                                        }
                                    }
                                }
                            }
                            if (xz4Var != null) {
                                xgVar.m.p(xz4Var);
                                return;
                            }
                            return;
                        case 27:
                            if (byteBuffer.remaining() >= 16) {
                                long j36 = byteBuffer.getLong();
                                long j37 = byteBuffer.getLong();
                                if (j36 > 0 && j37 > 0) {
                                    wz4Var = new wz4(j36, j37);
                                }
                            }
                            if (wz4Var != null) {
                                xgVar.m.p(wz4Var);
                                return;
                            }
                            return;
                        default:
                            i.c();
                            return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, n75] */
    public final void c() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? obj = new Object();
        this.c.post(new u(this, obj, countDownLatch, 16));
        countDownLatch.await();
        Exception exc = (Exception) obj.A;
        if (exc == null) {
            return;
        }
        throw exc;
    }

    public final void d() {
        if (!this.b.isAlive()) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Handler handler = this.c;
        if (b53.x(myLooper, handler.getLooper())) {
            e();
        } else {
            handler.post(new m0(22, this));
        }
    }

    public final void e() {
        MessageQueue queue;
        if (!this.f) {
            return;
        }
        this.f = false;
        ParcelFileDescriptor parcelFileDescriptor = this.d;
        if (parcelFileDescriptor != null) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null && (queue = myLooper.getQueue()) != null) {
                queue.removeOnFileDescriptorEventListener(parcelFileDescriptor.getFileDescriptor());
            }
            parcelFileDescriptor.close();
        }
        this.e = null;
        this.d = null;
        closeMessagePipe();
    }
}
