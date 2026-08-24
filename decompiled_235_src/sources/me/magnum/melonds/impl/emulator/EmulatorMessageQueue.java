package me.magnum.melonds.impl.emulator;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class EmulatorMessageQueue {
    public final h61 a;
    public final HandlerThread b;
    public final Handler c;
    public ParcelFileDescriptor d;
    public FileInputStream e;
    public boolean f;
    public final ByteBuffer g;
    public final ByteBuffer h;

    public EmulatorMessageQueue(h61 h61Var) {
        this.a = h61Var;
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
        iw1 iw1Var;
        Object obj;
        Object obj2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        f95 f95Var;
        boolean z;
        int i6;
        h95 h95Var;
        Object obj3;
        g95 g95Var;
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
                Iterator<E> it = mw1.getEntries().iterator();
                while (true) {
                    iw1Var = null;
                    g95Var = null;
                    g95Var = null;
                    g95Var = null;
                    h95Var = null;
                    h95Var = null;
                    h95Var = null;
                    h95Var = null;
                    h95Var = null;
                    f95Var = null;
                    f95Var = null;
                    f95Var = null;
                    f95Var = null;
                    obj2 = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((mw1) obj).getEvent() == i7) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                mw1 mw1Var = (mw1) obj;
                if (mw1Var != null) {
                    h61 h61Var = this.a;
                    ByteBuffer byteBuffer = this.h;
                    byteBuffer.getClass();
                    jh jhVar = (jh) h61Var.B;
                    boolean z2 = true;
                    int i9 = 32;
                    switch (vg.a[mw1Var.ordinal()]) {
                        case 1:
                            jhVar.l.k(new gw1(byteBuffer.getInt()));
                            return;
                        case 2:
                            jhVar.l.k(hw1.a);
                            return;
                        case 3:
                            int i10 = byteBuffer.getInt();
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 == 4) {
                                        iw1Var = iw1.PowerOff;
                                    }
                                } else {
                                    iw1Var = iw1.BadExceptionRegion;
                                }
                            } else {
                                iw1Var = iw1.GBAModeNotSupported;
                            }
                            if (iw1Var != null) {
                                jhVar.l.k(new jw1(iw1Var));
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
                                jhVar.l.k(new fw1(videoRenderer));
                                return;
                            }
                            return;
                        case 5:
                            jhVar.l.k(new kw1(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt()));
                            return;
                        case 6:
                            jhVar.n.k(new p85(byteBuffer.getLong()));
                            return;
                        case 7:
                            jhVar.n.k(new s85(byteBuffer.getLong()));
                            return;
                        case 8:
                            jhVar.n.k(new t85(byteBuffer.getLong()));
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
                            jhVar.n.k(new r85(i12, i13, j, new String(bArr, 0, i9, qm0.a)));
                            return;
                        case 10:
                            jhVar.n.k(new v85(byteBuffer.getLong()));
                            return;
                        case 11:
                            jhVar.n.k(new k95(byteBuffer.getLong()));
                            return;
                        case 12:
                            jhVar.n.k(new j95(byteBuffer.getInt(), byteBuffer.getLong(), cs1.t(32, byteBuffer), cs1.t(64, byteBuffer)));
                            return;
                        case 13:
                            jhVar.n.k(u85.a);
                            return;
                        case 14:
                            jhVar.n.k(i95.a);
                            return;
                        case 15:
                            long j2 = byteBuffer.getLong();
                            long j3 = byteBuffer.getLong();
                            long j4 = byteBuffer.getLong();
                            y85 y85Var = new y85(j2, j3, j4);
                            jhVar.q.j(j2, j3);
                            jhVar.h("STARTED", j2, j3, j4, "");
                            jhVar.n.k(y85Var);
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
                            String str = new String(bArr2, 0, i9, qm0.a);
                            boolean z3 = z2;
                            a95 a95Var = new a95(j5, j6, j7, str, z3);
                            bg1 bg1Var = jhVar.q;
                            if (z3) {
                                bg1Var.j(j5, j6);
                                jhVar.h("TRACKER_SHOW", j5, j6, j7, "tracker_display=".concat(str));
                            } else {
                                bt3 h = bg1Var.h(j5, j6);
                                if (h.a) {
                                    jhVar.h("TRACKER_UPDATE", j5, j6, j7, "tracker_display=" + str + " tracker_update_index=" + h.b + " suppressed_updates=" + h.c);
                                }
                            }
                            jhVar.n.k(a95Var);
                            return;
                        case 17:
                            long j8 = byteBuffer.getLong();
                            long j9 = byteBuffer.getLong();
                            long j10 = byteBuffer.getLong();
                            w85 w85Var = new w85(j8, j9, j10);
                            jhVar.q.j(j8, j9);
                            jhVar.h("CANCELED", j8, j9, j10, "");
                            jhVar.n.k(w85Var);
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
                            jhVar.n.k(new x85(new String(bArr3, 0, i9, qm0.a), i14, j11));
                            return;
                        case 19:
                            jhVar.n.k(new q85(byteBuffer.getLong()));
                            return;
                        case 20:
                            long j12 = byteBuffer.getLong();
                            long j13 = byteBuffer.getLong();
                            long j14 = byteBuffer.getLong();
                            e95 e95Var = new e95(j12, j13, j14);
                            jhVar.q.j(j12, j13);
                            jhVar.h("TRACKER_HIDE", j12, j13, j14, "");
                            jhVar.n.k(e95Var);
                            return;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
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
                            String str2 = new String(bArr4, 0, i9, qm0.a);
                            z85 z85Var = new z85(j15, j16, j17, str2);
                            jhVar.h("SUBMITTED", j15, j16, j17, "tracker_display=".concat(str2));
                            jhVar.n.k(z85Var);
                            return;
                        case 22:
                            long j18 = byteBuffer.getLong();
                            long j19 = byteBuffer.getLong();
                            long j20 = byteBuffer.getLong();
                            long j21 = byteBuffer.getInt() & 4294967295L;
                            long j22 = byteBuffer.getInt() & 4294967295L;
                            String t = cs1.t(32, byteBuffer);
                            String t2 = cs1.t(32, byteBuffer);
                            c95 c95Var = new c95(j18, j19, j20, t, t2, j21, j22);
                            jhVar.q.j(j18, j19);
                            StringBuilder u = i61.u("submitted_score=", t, " best_score=", t2, " rank=");
                            u.append(j21);
                            u.append(" num_entries=");
                            u.append(j22);
                            jhVar.h("SCOREBOARD", j18, j19, j20, u.toString());
                            jhVar.n.k(c95Var);
                            return;
                        case ConnectionResult.API_DISABLED /* 23 */:
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
                            d95 d95Var = new d95(j23, j24, j25, i15, new String(bArr5, 0, remaining5, qm0.a));
                            jhVar.q.j(j23, j24);
                            jhVar.h("SERVER_ERROR", j23, j24, j25, lb1.g(i15, "result="));
                            jhVar.n.k(d95Var);
                            return;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            long j26 = byteBuffer.getLong();
                            b95 b95Var = new b95(j26);
                            jhVar.q.k();
                            if (jhVar.p) {
                                Log.i("RASubmission", "event_type=jni_event_received jni_event=RUNTIME_RESET attempt_floor=" + j26);
                            }
                            jhVar.n.k(b95Var);
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
                                    hc5 hc5Var = ic5.Companion;
                                    int i16 = byteBuffer.getInt();
                                    hc5Var.getClass();
                                    ic5 a = hc5.a(i16);
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
                                        f95Var = new f95(j27, j28, j29, j30, a, j31, j32, j33, i17, z, new String(bArr6, 0, i9, qm0.a));
                                    }
                                }
                            }
                            if (f95Var != null) {
                                jhVar.n.k(f95Var);
                                return;
                            }
                            return;
                        case SubAllocator.N4 /* 26 */:
                            if (byteBuffer.remaining() >= 28) {
                                long j34 = byteBuffer.getLong();
                                long j35 = byteBuffer.getLong();
                                if (j34 > 0 && j35 > 0) {
                                    hc5 hc5Var2 = ic5.Companion;
                                    int i18 = byteBuffer.getInt();
                                    hc5Var2.getClass();
                                    ic5 a2 = hc5.a(i18);
                                    if (a2 != null) {
                                        fc5 fc5Var = gc5.Companion;
                                        int i19 = byteBuffer.getInt();
                                        fc5Var.getClass();
                                        Iterator<E> it3 = gc5.getEntries().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj3 = it3.next();
                                                if (((gc5) obj3).getWireValue() == i19) {
                                                }
                                            } else {
                                                obj3 = null;
                                            }
                                        }
                                        gc5 gc5Var = (gc5) obj3;
                                        if (gc5Var != null) {
                                            h95Var = new h95(j34, j35, a2, gc5Var, byteBuffer.getInt());
                                        }
                                    }
                                }
                            }
                            if (h95Var != null) {
                                jhVar.n.k(h95Var);
                                return;
                            }
                            return;
                        case 27:
                            if (byteBuffer.remaining() >= 16) {
                                long j36 = byteBuffer.getLong();
                                long j37 = byteBuffer.getLong();
                                if (j36 > 0 && j37 > 0) {
                                    g95Var = new g95(j36, j37);
                                }
                            }
                            if (g95Var != null) {
                                jhVar.n.k(g95Var);
                                return;
                            }
                            return;
                        default:
                            i.d();
                            return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dh5, java.lang.Object] */
    public final void c() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? obj = new Object();
        this.c.post(new v(this, obj, countDownLatch, 17));
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
        if (nb3.k(myLooper, handler.getLooper())) {
            e();
        } else {
            handler.post(new n0(this, 22));
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
