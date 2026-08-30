package me.magnum.melonds.impl.emulator;

import ah.e;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import cd.e1;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import pf.a;
import pf.j;
import pf.k;
import se.b;
import se.c;
import se.d;
import xe.f;
import xe.g;
import xe.h;
import xe.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class EmulatorMessageQueue {

    /* renamed from: a  reason: collision with root package name */
    public final e f9480a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f9481b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f9482c;

    /* renamed from: d  reason: collision with root package name */
    public ParcelFileDescriptor f9483d;

    /* renamed from: e  reason: collision with root package name */
    public FileInputStream f9484e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9485f;

    /* renamed from: g  reason: collision with root package name */
    public final ByteBuffer f9486g;

    /* renamed from: h  reason: collision with root package name */
    public final ByteBuffer f9487h;

    public EmulatorMessageQueue(e eVar) {
        this.f9480a = eVar;
        HandlerThread handlerThread = new HandlerThread("EmulatorMessageQueue");
        handlerThread.start();
        this.f9481b = handlerThread;
        this.f9482c = new Handler(handlerThread.getLooper());
        this.f9486g = ByteBuffer.allocateDirect(8).order(ByteOrder.nativeOrder());
        this.f9487h = ByteBuffer.allocateDirect(128).order(ByteOrder.nativeOrder());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void closeMessagePipe();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int initMessagePipe();

    public final void c() {
        c cVar;
        Object obj;
        FileInputStream fileInputStream = this.f9484e;
        if (fileInputStream != null) {
            ByteBuffer byteBuffer = this.f9486g;
            byteBuffer.clear();
            int read = fileInputStream.getChannel().read(byteBuffer);
            byteBuffer.position(0);
            if (read >= 8) {
                int i2 = byteBuffer.getInt();
                int i10 = byteBuffer.getInt();
                ByteBuffer byteBuffer2 = this.f9487h;
                if (i10 > 0) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(i10);
                    int read2 = fileInputStream.getChannel().read(byteBuffer2);
                    byteBuffer2.position(0);
                    if (read2 < i10) {
                        return;
                    }
                }
                Iterator<E> it = k.getEntries().iterator();
                while (true) {
                    cVar = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((k) obj).getEvent() == i2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                k kVar = (k) obj;
                if (kVar != null) {
                    byteBuffer2.getClass();
                    j jVar = (j) this.f9480a.B;
                    e1 e1Var = jVar.f11635h;
                    e1 e1Var2 = jVar.f11637j;
                    switch (a.f11622a[kVar.ordinal()]) {
                        case DSiCameraSource.FrontCamera /* 1 */:
                            e1Var.p(new se.a(byteBuffer2.getInt()));
                            return;
                        case 2:
                            e1Var.p(b.f12876a);
                            return;
                        case 3:
                            int i11 = byteBuffer2.getInt();
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 == 4) {
                                        cVar = c.PowerOff;
                                    }
                                } else {
                                    cVar = c.BadExceptionRegion;
                                }
                            } else {
                                cVar = c.GBAModeNotSupported;
                            }
                            if (cVar != null) {
                                e1Var.p(new d(cVar));
                                return;
                            }
                            return;
                        case 4:
                            e1Var2.p(new xe.d(byteBuffer2.getLong()));
                            return;
                        case l1.c.f8511g /* 5 */:
                            e1Var2.p(new f(byteBuffer2.getLong()));
                            return;
                        case l1.c.f8509e /* 6 */:
                            e1Var2.p(new g(byteBuffer2.getLong()));
                            return;
                        case 7:
                            long j2 = byteBuffer2.getLong();
                            int i12 = byteBuffer2.getInt();
                            int i13 = byteBuffer2.getInt();
                            byte[] bArr = new byte[byteBuffer2.getInt()];
                            byteBuffer2.get(bArr);
                            e1Var2.p(new xe.e(i12, i13, j2, new String(bArr, vc.a.f13781a)));
                            return;
                        case 8:
                            e1Var2.p(new xe.j(byteBuffer2.getLong()));
                            return;
                        case l1.c.f8508d /* 9 */:
                            long j10 = byteBuffer2.getLong();
                            byte[] bArr2 = new byte[byteBuffer2.getInt()];
                            byteBuffer2.get(bArr2);
                            e1Var2.p(new xe.k(j10, new String(bArr2, vc.a.f13781a)));
                            return;
                        case l1.c.f8510f /* 10 */:
                            e1Var2.p(new h(byteBuffer2.getLong()));
                            return;
                        case 11:
                            long j11 = byteBuffer2.getLong();
                            int i14 = byteBuffer2.getInt();
                            byte[] bArr3 = new byte[byteBuffer2.getInt()];
                            byteBuffer2.get(bArr3);
                            e1Var2.p(new i(new String(bArr3, vc.a.f13781a), i14, j11));
                            return;
                        default:
                            o.o();
                            return;
                    }
                }
            }
        }
    }
}
