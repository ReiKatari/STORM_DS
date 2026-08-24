package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import android.util.Size;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import com.google.android.gms.common.ConnectionResult;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eb  reason: default package */
/* loaded from: classes.dex */
public final class eb implements mr6, gz, f13, rm6, ll7 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;
    public Object X;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7 */
    public eb(e23 e23Var, Size size, CameraCharacteristics cameraCharacteristics, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        o54 s63Var;
        hk0 hk0Var;
        o54 o54Var;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        o54 o54Var2;
        this.A = 10;
        nj2.h();
        this.B = e23Var;
        vi0 vi0Var = (vi0) e23Var.b(zi7.J, null);
        if (vi0Var != null) {
            int i3 = 0;
            dk0 dk0Var = new dk0(0);
            vi0Var.a(e23Var, dk0Var);
            dk0Var.i();
            bt btVar = new bt(10, false);
            this.L = btVar;
            Executor executor = (Executor) e23Var.b(dc3.y, u24.u());
            Objects.requireNonNull(executor);
            ci ciVar = new ci(executor, cameraCharacteristics);
            this.R = ciVar;
            ArrayList arrayList = new ArrayList();
            if (((Integer) e23Var.b(j23.m, 0)).intValue() != 0) {
                arrayList.add(32);
                arrayList.add(256);
            } else {
                Integer num = (Integer) e23Var.b(e23.R, null);
                if (num != null) {
                    i = num.intValue();
                } else {
                    Integer num2 = (Integer) e23Var.b(j23.l, null);
                    if (num2 != null && num2.intValue() == 4101) {
                        i = 4101;
                    } else if (num2 != null && num2.intValue() == 32) {
                        i = 32;
                    } else {
                        i = 256;
                    }
                }
                arrayList.add(Integer.valueOf(i));
            }
            int q = e23Var.q();
            if (e23Var.b(e23.Y, null) == null) {
                jr1 jr1Var = new jr1();
                jr1 jr1Var2 = new jr1();
                vx vxVar = new vx(size, q, arrayList, z, jr1Var, jr1Var2);
                this.X = vxVar;
                if (((vx) btVar.R) == null && ((re5) btVar.B) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                np2.A("CaptureNode does not support recreation yet.", z2);
                btVar.R = vxVar;
                Object obj = new Object();
                if (arrayList.size() > 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z) {
                    if (z3) {
                        z7 = true;
                        i2 = 0;
                        o54Var2 = new o54(size.getWidth(), size.getHeight(), 256, 4);
                        vy7.Y(obj, o54Var2.B);
                        o54Var = new o54(size.getWidth(), size.getHeight(), 32, 4);
                        vy7.Y(obj, o54Var.B);
                    } else {
                        z7 = true;
                        i2 = 0;
                        o54 o54Var3 = new o54(size.getWidth(), size.getHeight(), q, 4);
                        vy7.Y(obj, o54Var3.B);
                        o54Var2 = o54Var3;
                        o54Var = null;
                    }
                    i3 = i2;
                    hk0Var = new hk0(btVar, i3);
                    z4 = z7;
                    s63Var = o54Var2;
                } else {
                    z4 = true;
                    s63Var = new s63(ln2.l(size.getWidth(), size.getHeight(), q, 4), 21);
                    hk0Var = new hk0(btVar, 1);
                    o54Var = null;
                }
                Surface surface = s63Var.getSurface();
                Objects.requireNonNull(surface);
                if (vxVar.a == null) {
                    z5 = z4;
                } else {
                    z5 = i3;
                }
                np2.A("The surface is already set.", z5);
                vxVar.a = new o33(surface, size, q);
                btVar.B = new re5(s63Var);
                s63Var.e(new i(btVar), u24.x());
                if (z3 && o54Var != null) {
                    Surface surface2 = o54Var.getSurface();
                    if (vxVar.b == null) {
                        z6 = z4;
                    } else {
                        z6 = false;
                    }
                    np2.A("The secondary surface is already set.", z6);
                    vxVar.b = new o33(surface2, size, q);
                    btVar.L = new re5(o54Var);
                    o54Var.e(new i(btVar), u24.x());
                }
                jr1Var.b = hk0Var;
                jr1Var2.b = new hk0(btVar, 2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = (IncorrectJpegMetadataQuirk) ((y65) ciVar.R).b(IncorrectJpegMetadataQuirk.class);
                return;
            }
            u34.a();
            throw null;
        }
        e41.z((String) e23Var.b(kz6.C, e23Var.toString()), "Implementation is missing option unpacker for ");
        throw null;
    }

    public static void L(eb ebVar, ge5 ge5Var, je5 je5Var, ge5 ge5Var2, int i) {
        d51 d51Var;
        ge5 B;
        if ((i & 1) != 0) {
            ge5Var = null;
        }
        if ((i & 2) != 0) {
            je5Var = null;
        }
        if ((i & 4) != 0) {
            ge5Var2 = null;
        }
        ebVar.getClass();
        TimeZone timeZone = az7.a;
        boolean isShutdown = ((ThreadPoolExecutor) ebVar.A()).isShutdown();
        synchronized (ebVar) {
            if (je5Var != null) {
                try {
                    if (!((ArrayDeque) ebVar.X).remove(je5Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (ge5Var2 != null) {
                ge5Var2.B.decrementAndGet();
                if (!((ArrayDeque) ebVar.R).remove(ge5Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (ge5Var != null) {
                ((ArrayDeque) ebVar.L).add(ge5Var);
                je5 je5Var2 = ge5Var.L;
                if (!je5Var2.L && (B = ebVar.B(((i03) je5Var2.B.B).d)) != null) {
                    ge5Var.B = B.B;
                }
            }
            if ((je5Var != null || ge5Var2 != null) && (isShutdown || ((ArrayDeque) ebVar.R).isEmpty())) {
                ((ArrayDeque) ebVar.X).isEmpty();
            }
            if (isShutdown) {
                List k1 = gt0.k1((ArrayDeque) ebVar.L);
                ((ArrayDeque) ebVar.L).clear();
                d51Var = new d51(k1, 9);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) ebVar.L).iterator();
                it.getClass();
                while (it.hasNext()) {
                    ge5 ge5Var3 = (ge5) it.next();
                    if (((ArrayDeque) ebVar.R).size() >= 64) {
                        break;
                    } else if (ge5Var3.B.get() < 5) {
                        it.remove();
                        ge5Var3.B.incrementAndGet();
                        arrayList.add(ge5Var3);
                        ((ArrayDeque) ebVar.R).add(ge5Var3);
                    }
                }
                d51Var = new d51(arrayList, 9);
            }
        }
        int size = ((List) d51Var.B).size();
        for (int i2 = 0; i2 < size; i2++) {
            ge5 ge5Var4 = (ge5) ((List) d51Var.B).get(i2);
            if (ge5Var4 != ge5Var) {
                je5 je5Var3 = ge5Var4.L;
            }
            if (isShutdown) {
                ge5Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                je5 je5Var4 = ge5Var4.L;
                je5Var4.j(interruptedIOException);
                ge5Var4.A.k(je5Var4, interruptedIOException);
            } else {
                ExecutorService A = ebVar.A();
                ge5Var4.getClass();
                je5 je5Var5 = ge5Var4.L;
                je5Var5.A.a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) A).execute(ge5Var4);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                        interruptedIOException2.initCause(e);
                        je5 je5Var6 = ge5Var4.L;
                        je5Var6.j(interruptedIOException2);
                        ge5Var4.A.k(je5Var6, interruptedIOException2);
                        eb ebVar2 = je5Var5.A.a;
                        ebVar2.getClass();
                        L(ebVar2, null, null, ge5Var4, 3);
                    }
                } catch (Throwable th2) {
                    eb ebVar3 = je5Var5.A.a;
                    ebVar3.getClass();
                    L(ebVar3, null, null, ge5Var4, 3);
                    throw th2;
                }
            }
        }
    }

    public static void e(eb ebVar, jd4 jd4Var) {
        ebVar.getClass();
        jd4Var.getClass();
        if (((LinkedHashSet) ebVar.R).add(jd4Var)) {
            md4 md4Var = (md4) ebVar.L;
            md4Var.getClass();
            if (jd4Var.c == null) {
                md4Var.e.addFirst(jd4Var);
                jd4Var.c = ebVar;
                md4Var.b();
                return;
            }
            u34.A(jd4Var, "' is already registered with a dispatcher", "Handler '");
        }
    }

    public synchronized ExecutorService A() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.B) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.B = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new zy7(az7.b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.B;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public ge5 B(String str) {
        Iterator it = ((ArrayDeque) this.R).iterator();
        it.getClass();
        while (it.hasNext()) {
            ge5 ge5Var = (ge5) it.next();
            if (nb3.k(((i03) ge5Var.L.B.B).d, str)) {
                return ge5Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.L).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            ge5 ge5Var2 = (ge5) it2.next();
            if (nb3.k(((i03) ge5Var2.L.B.B).d, str)) {
                return ge5Var2;
            }
        }
        return null;
    }

    public hu6 C(k8 k8Var) {
        ArrayList arrayList = (ArrayList) this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hu6 hu6Var = (hu6) arrayList.get(i);
            if (hu6Var != null && hu6Var.b == k8Var) {
                return hu6Var;
            }
        }
        hu6 hu6Var2 = new hu6((Context) this.L, k8Var);
        arrayList.add(hu6Var2);
        return hu6Var2;
    }

    public w61 D() {
        w61 w61Var = (w61) ((on2) this.R).c();
        if (w61Var != null) {
            return w61Var;
        }
        i.m("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public ap E(ap apVar, ap apVar2) {
        eb ebVar = this;
        if (((ap) ebVar.X) == null) {
            ebVar.X = apVar.c();
        }
        ap apVar3 = (ap) ebVar.X;
        if (apVar3 != null) {
            int b = apVar3.b();
            int i = 0;
            while (true) {
                ap apVar4 = (ap) ebVar.X;
                if (i < b) {
                    if (apVar4 != null) {
                        float a = apVar.a(i);
                        float a2 = apVar2.a(i);
                        gv gvVar = (gv) ((s35) ebVar.B).A;
                        double b2 = gvVar.b(a2);
                        double d = ud2.a;
                        float f = gvVar.a * gvVar.b;
                        apVar4.e(i, (Math.signum(a2) * ((float) (Math.exp((d / (d - 1.0d)) * b2) * f))) + a);
                        i++;
                        ebVar = this;
                        b = b;
                    } else {
                        nb3.a0("targetVector");
                        throw null;
                    }
                } else if (apVar4 != null) {
                    return apVar4;
                } else {
                    nb3.a0("targetVector");
                    throw null;
                }
            }
        } else {
            nb3.a0("targetVector");
            throw null;
        }
    }

    public ap F(long j, ap apVar, ap apVar2) {
        float f;
        if (((ap) this.R) == null) {
            this.R = apVar.c();
        }
        ap apVar3 = (ap) this.R;
        if (apVar3 != null) {
            int b = apVar3.b();
            int i = 0;
            while (true) {
                ap apVar4 = (ap) this.R;
                if (i < b) {
                    if (apVar4 != null) {
                        apVar.getClass();
                        long j2 = j / 1000000;
                        td2 a = ((gv) ((s35) this.B).A).a(apVar2.a(i));
                        long j3 = a.c;
                        if (j3 > 0) {
                            f = ((float) j2) / ((float) j3);
                        } else {
                            f = 1.0f;
                        }
                        apVar4.e(i, (((Math.signum(a.a) * qh.a(f).b) * a.b) / ((float) j3)) * 1000.0f);
                        i++;
                    } else {
                        nb3.a0("velocityVector");
                        throw null;
                    }
                } else if (apVar4 != null) {
                    return apVar4;
                } else {
                    nb3.a0("velocityVector");
                    throw null;
                }
            }
        } else {
            nb3.a0("velocityVector");
            throw null;
        }
    }

    public qo7 G(ar0 ar0Var, String str) {
        qo7 qo7Var;
        qo7 a;
        synchronized (((x31) this.X)) {
            try {
                ap7 ap7Var = (ap7) this.B;
                ap7Var.getClass();
                qo7Var = (qo7) ap7Var.a.get(str);
                if (ar0Var.d(qo7Var)) {
                    yo7 yo7Var = (yo7) this.L;
                    if (yo7Var instanceof h56) {
                        h56 h56Var = (h56) yo7Var;
                        qo7Var.getClass();
                        ut3 ut3Var = h56Var.d;
                        if (ut3Var != null) {
                            d56 d56Var = h56Var.e;
                            d56Var.getClass();
                            uj2.m(qo7Var, d56Var, ut3Var);
                        }
                    }
                    qo7Var.getClass();
                } else {
                    m94 m94Var = new m94((j71) this.R);
                    m94Var.a.put(os0.X, str);
                    yo7 yo7Var2 = (yo7) this.L;
                    yo7Var2.getClass();
                    try {
                        try {
                            a = yo7Var2.c(ar0Var, m94Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = ar0Var.a;
                            cls.getClass();
                            a = yo7Var2.b(cls, m94Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = ar0Var.a;
                        cls2.getClass();
                        a = yo7Var2.a(cls2);
                    }
                    qo7Var = a;
                    ap7 ap7Var2 = (ap7) this.B;
                    ap7Var2.getClass();
                    qo7Var.getClass();
                    qo7 qo7Var2 = (qo7) ap7Var2.a.put(str, qo7Var);
                    if (qo7Var2 != null) {
                        qo7Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qo7Var;
    }

    public int H() {
        return ((sn6) this.R).A.length();
    }

    public long I() {
        long j;
        long j2;
        long j3;
        AtomicLong atomicLong = (AtomicLong) this.L;
        do {
            j = atomicLong.get();
            Long valueOf = Long.valueOf(j);
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            j2 = 1;
            if (valueOf != null) {
                j3 = valueOf.longValue();
            } else {
                j3 = 1;
            }
            if (j3 != Long.MAX_VALUE) {
                j2 = 1 + j3;
            }
        } while (!atomicLong.compareAndSet(j, j2));
        return j3;
    }

    public boolean J(k8 k8Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.B).onActionItemClicked(C(k8Var), new s44((Context) this.L, (lu6) menuItem));
    }

    public boolean K(k8 k8Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.B;
        hu6 C = C(k8Var);
        ci6 ci6Var = (ci6) this.X;
        Menu menu2 = (Menu) ci6Var.get(menu);
        if (menu2 == null) {
            menu2 = new e54((Context) this.L, (i44) menu);
            ci6Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(C, menu2);
    }

    public void M(a21 a21Var, int i) {
        Class<?> cls = a21Var.getClass();
        d14 d14Var = (d14) this.B;
        i50 i50Var = (i50) d14Var.g.A.get(cls);
        if (i50Var != null) {
            Object a = i50Var.a(d14Var, (ng3) this.L);
            sn6 sn6Var = (sn6) this.R;
            StringBuilder sb = sn6Var.A;
            int length = sb.length();
            int length2 = sb.length();
            if (length > i && i >= 0 && length <= length2) {
                sn6.c(sn6Var, a, i, length);
            }
        }
    }

    public void N(long j, dd5 dd5Var, ed5 ed5Var) {
        wc5 wc5Var;
        dd5Var.getClass();
        ed5Var.getClass();
        synchronized (this.B) {
            try {
                Object value = ((tp6) this.R).getValue();
                if (value instanceof wc5) {
                    wc5Var = (wc5) value;
                } else {
                    wc5Var = null;
                }
                if (wc5Var != null && wc5Var.a == j) {
                    tp6 tp6Var = (tp6) this.R;
                    vc5 vc5Var = new vc5(j, dd5Var, ed5Var, wc5Var.c);
                    tp6Var.getClass();
                    tp6Var.m(null, vc5Var);
                }
            } finally {
            }
        }
    }

    public void O(jp6 jp6Var) {
        jp6Var.getClass();
        q64 q64Var = new q64(10, this, jp6Var);
        synchronized (this.R) {
            Runnable runnable = (Runnable) ((LinkedHashMap) this.X).put(jp6Var, q64Var);
        }
        ((Handler) ((d51) this.B).B).postDelayed(q64Var, 5400000L);
    }

    public void P(a21 a21Var) {
        g14 g14Var = (g14) ((Map) this.X).get(a21Var.getClass());
        if (g14Var != null) {
            g14Var.a(this, a21Var);
        } else {
            Q(a21Var);
        }
    }

    public void Q(a21 a21Var) {
        for (a21 a21Var2 = (a21) a21Var.c; a21Var2 != null; a21Var2 = (a21) a21Var2.f) {
            a21Var2.a(this);
        }
    }

    @Override // defpackage.il7
    public long b(ap apVar, ap apVar2, ap apVar3) {
        int b = apVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((j97) this.B).e(i).c(apVar.a(i), apVar2.a(i), apVar3.a(i)));
        }
        return j;
    }

    @Override // defpackage.mr6
    public synchronized void c(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() == ((gb) this.X).e()) {
            if (byteBuffer.get() == ((gb) this.X).e()) {
                this.R = new byte[7];
                byte[] bArr2 = new byte[((gb) this.X).a];
                byteBuffer.get(bArr2);
                byteBuffer.get((byte[]) this.R);
                gb gbVar = (gb) this.X;
                this.B = new SecretKeySpec(gi2.v(gbVar.d, gbVar.e, bArr2, bArr, gbVar.a), "AES");
                this.L = (Cipher) p42.e.a("AES/GCM/NoPadding");
            } else {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
    }

    @Override // defpackage.rm6
    public void cancel() {
        ((Socket) this.B).close();
    }

    @Override // defpackage.mr6
    public synchronized void d(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        ((Cipher) this.L).init(2, (SecretKeySpec) this.B, gb.i((byte[]) this.R, i, z));
        ((Cipher) this.L).doFinal(byteBuffer, byteBuffer2);
    }

    public void f(ld4 ld4Var) {
        if (((LinkedHashSet) this.X).add(ld4Var)) {
            ((md4) this.L).a(this, ld4Var, -1);
        }
    }

    public void g(al4 al4Var, int i) {
        if (i != 1 && i != 0) {
            i.f(lb1.g(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.X).add(al4Var)) {
            ((md4) this.L).a(this, al4Var, i);
        }
    }

    @Override // defpackage.il7
    public ap h(long j, ap apVar, ap apVar2, ap apVar3) {
        if (((ap) this.R) == null) {
            this.R = apVar3.c();
        }
        ap apVar4 = (ap) this.R;
        if (apVar4 != null) {
            int b = apVar4.b();
            int i = 0;
            while (true) {
                ap apVar5 = (ap) this.R;
                if (i < b) {
                    if (apVar5 != null) {
                        apVar5.e(i, ((j97) this.B).e(i).b(j, apVar.a(i), apVar2.a(i), apVar3.a(i)));
                        i++;
                    } else {
                        nb3.a0("velocityVector");
                        throw null;
                    }
                } else if (apVar5 != null) {
                    return apVar5;
                } else {
                    nb3.a0("velocityVector");
                    throw null;
                }
            }
        } else {
            nb3.a0("velocityVector");
            throw null;
        }
    }

    public void i(String str, String str2) {
        String str3;
        if (((String) this.X).length() == 0) {
            str3 = "?";
        } else {
            str3 = "&";
        }
        this.X = ((String) this.X) + str3 + str + '=' + str2;
    }

    @Override // defpackage.f13
    public Object j(String str, String str2, String str3, s41 s41Var) {
        xe1 xe1Var = xk1.a;
        return hv.d0(de1.L, new ag(this, str, str3, null, 4), s41Var);
    }

    @Override // defpackage.rm6
    public in6 k() {
        return (ef1) this.R;
    }

    public void l(a21 a21Var) {
        if (((a21) a21Var.f) != null) {
            z();
            ((sn6) this.R).a('\n');
        }
    }

    public void m(jp6 jp6Var) {
        Runnable runnable;
        jp6Var.getClass();
        synchronized (this.R) {
            runnable = (Runnable) ((LinkedHashMap) this.X).remove(jp6Var);
        }
        if (runnable != null) {
            ((Handler) ((d51) this.B).B).removeCallbacks(runnable);
        }
    }

    public void n(long j) {
        synchronized (this.B) {
            Long j2 = np2.j((xc5) ((tp6) this.R).getValue());
            if (j2 != null && j2.longValue() == j) {
                tp6 tp6Var = (tp6) this.R;
                uc5 uc5Var = uc5.a;
                tp6Var.getClass();
                tp6Var.m(null, uc5Var);
            }
        }
    }

    @Override // defpackage.il7
    public ap q(long j, ap apVar, ap apVar2, ap apVar3) {
        if (((ap) this.L) == null) {
            this.L = apVar.c();
        }
        ap apVar4 = (ap) this.L;
        if (apVar4 != null) {
            int b = apVar4.b();
            int i = 0;
            while (true) {
                ap apVar5 = (ap) this.L;
                if (i < b) {
                    if (apVar5 != null) {
                        apVar5.e(i, ((j97) this.B).e(i).e(j, apVar.a(i), apVar2.a(i), apVar3.a(i)));
                        i++;
                    } else {
                        nb3.a0("valueVector");
                        throw null;
                    }
                } else if (apVar5 != null) {
                    return apVar5;
                } else {
                    nb3.a0("valueVector");
                    throw null;
                }
            }
        } else {
            nb3.a0("valueVector");
            throw null;
        }
    }

    @Override // defpackage.il7
    public ap r(ap apVar, ap apVar2, ap apVar3) {
        if (((ap) this.X) == null) {
            this.X = apVar3.c();
        }
        ap apVar4 = (ap) this.X;
        if (apVar4 != null) {
            int b = apVar4.b();
            int i = 0;
            while (true) {
                ap apVar5 = (ap) this.X;
                if (i < b) {
                    if (apVar5 != null) {
                        apVar5.e(i, ((j97) this.B).e(i).d(apVar.a(i), apVar2.a(i), apVar3.a(i)));
                        i++;
                    } else {
                        nb3.a0("endVelocityVector");
                        throw null;
                    }
                } else if (apVar5 != null) {
                    return apVar5;
                } else {
                    nb3.a0("endVelocityVector");
                    throw null;
                }
            }
        } else {
            nb3.a0("endVelocityVector");
            throw null;
        }
    }

    public void s() {
        o33 o33Var;
        nj2.h();
        bt btVar = (bt) this.L;
        btVar.getClass();
        nj2.h();
        vx vxVar = (vx) btVar.R;
        Objects.requireNonNull(vxVar);
        re5 re5Var = (re5) btVar.B;
        Objects.requireNonNull(re5Var);
        re5 re5Var2 = (re5) btVar.L;
        o33 o33Var2 = vxVar.a;
        Objects.requireNonNull(o33Var2);
        o33Var2.a();
        o33 o33Var3 = vxVar.a;
        Objects.requireNonNull(o33Var3);
        l.F(o33Var3.e).a(u24.x(), new ik0(re5Var, 0));
        o33 o33Var4 = vxVar.c;
        if (o33Var4 != null) {
            o33Var4.a();
            l.F(vxVar.c.e).a(u24.x(), new ik0(null, 1));
        }
        if (vxVar.f.size() > 1 && (o33Var = vxVar.b) != null) {
            o33Var.a();
            l.F(vxVar.b.e).a(u24.x(), new ik0(re5Var2, 2));
        }
        ((ci) this.R).getClass();
    }

    public sc5 t() {
        xc5 xc5Var = (xc5) ((tp6) this.R).getValue();
        if (nb3.k(xc5Var, uc5.a)) {
            return null;
        }
        if (xc5Var instanceof tc5) {
            return np2.k(((tc5) xc5Var).c);
        }
        if (xc5Var instanceof wc5) {
            return ((wc5) xc5Var).c;
        }
        if (xc5Var instanceof vc5) {
            return ((vc5) xc5Var).d;
        }
        i.d();
        return null;
    }

    public String toString() {
        switch (this.A) {
            case 7:
                String socket = ((Socket) this.B).toString();
                socket.getClass();
                return socket;
            case 20:
                StringBuilder sb = new StringBuilder("StreamMap with indices of ");
                sb.append(((int[]) this.B).length);
                sb.append(" folders, offsets of ");
                sb.append(((long[]) this.L).length);
                sb.append(" packed streams, first files of ");
                sb.append(((int[]) this.R).length);
                sb.append(" folders and folder indices for ");
                return lb1.o(sb, ((int[]) this.X).length, " files");
            default:
                return super.toString();
        }
    }

    public void u(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((ci6) this.L).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    u(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        u34.j("This graph contains cyclic dependencies");
    }

    public void v(ld4 ld4Var, hd4 hd4Var) {
        md4 md4Var = (md4) this.L;
        md4Var.getClass();
        if (md4Var.g == 0) {
            jd4 c = md4Var.c(-1);
            md4Var.f = c;
            md4Var.g = -1;
            md4Var.h = ld4Var;
            if (hd4Var != null) {
                if (c != null) {
                    c.d(hd4Var);
                }
                tp6 tp6Var = md4Var.a;
                od4 od4Var = new od4(hd4Var);
                tp6Var.getClass();
                tp6Var.m(null, od4Var);
            }
        }
    }

    @Override // defpackage.rm6
    public ui6 w() {
        return (df1) this.X;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r0 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r0 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(long j, long j2, s41 s41Var) {
        be4 be4Var;
        int i;
        ge4 ge4Var;
        long j3;
        if (s41Var instanceof be4) {
            be4Var = (be4) s41Var;
            int i2 = be4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                be4Var.Y = i2 - Integer.MIN_VALUE;
                be4 be4Var2 = be4Var;
                Object obj = be4Var2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = be4Var2.Y;
                ge4 ge4Var2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            j3 = ((ol7) obj).a;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        j3 = ((ol7) obj).a;
                    }
                } else {
                    oi2.Y(obj);
                    ge4 ge4Var3 = (ge4) this.B;
                    if (ge4Var3 != null) {
                        ge4Var = ge4Var3.S0();
                    } else {
                        ge4Var = null;
                    }
                    j3 = 0;
                    if (ge4Var == null) {
                        ge4 ge4Var4 = (ge4) this.L;
                        if (ge4Var4 != null) {
                            be4Var2.Y = 1;
                            obj = ge4Var4.z0(j, j2, be4Var2);
                        }
                    } else {
                        ge4 ge4Var5 = (ge4) this.B;
                        if (ge4Var5 != null) {
                            ge4Var2 = ge4Var5.S0();
                        }
                        ge4 ge4Var6 = ge4Var2;
                        if (ge4Var6 != null) {
                            be4Var2.Y = 2;
                            obj = ge4Var6.z0(j, j2, be4Var2);
                        }
                    }
                }
                return new ol7(j3);
            }
        }
        be4Var = new be4(this, s41Var);
        be4 be4Var22 = be4Var;
        Object obj2 = be4Var22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = be4Var22.Y;
        ge4 ge4Var22 = null;
        if (i == 0) {
        }
        return new ol7(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(long j, s41 s41Var) {
        ce4 ce4Var;
        int i;
        long j2;
        if (s41Var instanceof ce4) {
            ce4Var = (ce4) s41Var;
            int i2 = ce4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ce4Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = ce4Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ce4Var.Y;
                ge4 ge4Var = null;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ge4 ge4Var2 = (ge4) this.B;
                    if (ge4Var2 != null) {
                        ge4Var = ge4Var2.S0();
                    }
                    if (ge4Var != null) {
                        ce4Var.Y = 1;
                        obj = ge4Var.H(j, ce4Var);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    } else {
                        j2 = 0;
                        return new ol7(j2);
                    }
                }
                j2 = ((ol7) obj).a;
                return new ol7(j2);
            }
        }
        ce4Var = new ce4(this, s41Var);
        Object obj2 = ce4Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ce4Var.Y;
        ge4 ge4Var3 = null;
        if (i == 0) {
        }
        j2 = ((ol7) obj2).a;
        return new ol7(j2);
    }

    public void z() {
        sn6 sn6Var = (sn6) this.R;
        StringBuilder sb = sn6Var.A;
        if (sb.length() > 0 && '\n' != sb.charAt(sb.length() - 1)) {
            sn6Var.a('\n');
        }
    }

    public /* synthetic */ eb(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public /* synthetic */ eb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }

    public eb(int i) {
        this.A = i;
        switch (i) {
            case 8:
                this.B = new tz4(10);
                this.L = new ci6(0);
                this.R = new ArrayList();
                this.X = new HashSet();
                return;
            case 9:
                this.L = new ArrayDeque();
                this.R = new ArrayDeque();
                this.X = new ArrayDeque();
                return;
            case 14:
                this.R = new pj(this, 13);
                return;
            case 15:
                this.B = new ArrayList();
                this.L = new ArrayList();
                this.R = new ArrayList();
                this.X = am1.p;
                return;
            case 17:
                this.B = new Object();
                this.L = new AtomicLong(1L);
                tp6 a = up6.a(uc5.a);
                this.R = a;
                this.X = new de5(a);
                return;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                this.B = new ci6(0);
                this.L = new SparseArray();
                this.R = new hz3((Object) null);
                this.X = new ci6(0);
                return;
            default:
                return;
        }
    }

    public eb(ap7 ap7Var, yo7 yo7Var, j71 j71Var) {
        this.A = 27;
        ap7Var.getClass();
        yo7Var.getClass();
        j71Var.getClass();
        this.B = ap7Var;
        this.L = yo7Var;
        this.R = j71Var;
        this.X = new x31(26);
    }

    public eb(eb ebVar) {
        this.A = 16;
        LinkedHashSet linkedHashSet = am1.p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) ebVar.B);
        for (Class cls : (LinkedHashSet) ebVar.X) {
            arrayList.add(am1.q.get(cls));
        }
        this.B = arrayList;
        this.R = new Object();
        this.X = (ArrayList) ebVar.R;
        ArrayList arrayList2 = (ArrayList) ebVar.L;
        this.L = arrayList2;
        new v53(new yc1(arrayList2, Collections.EMPTY_MAP));
    }

    public eb(Socket socket) {
        this.A = 7;
        this.B = socket;
        this.L = new AtomicInteger();
        this.R = new ef1(this);
        this.X = new df1(this);
    }

    public eb(te teVar, mz mzVar) {
        this.A = 1;
        this.B = teVar;
        this.L = mzVar;
        AutofillManager i = k2.i(teVar.getContext().getSystemService(k2.l()));
        if (i != null) {
            this.R = i;
            teVar.setImportantForAutofill(1);
            u2 z = hi2.z(teVar);
            AutofillId b = z != null ? au.b(z.b) : null;
            if (b != null) {
                this.X = b;
                return;
            }
            throw i61.e("Required value was null.");
        }
        i.m("Autofill service could not be located.");
        throw null;
    }

    public eb(gg3 gg3Var) {
        this.A = 18;
        this.R = "";
        this.X = "";
        this.B = gg3Var;
        this.L = gg3Var.e().a();
    }

    public eb(d14 d14Var, ng3 ng3Var, sn6 sn6Var, Map map, xd5 xd5Var) {
        this.A = 11;
        this.B = d14Var;
        this.L = ng3Var;
        this.R = sn6Var;
        this.X = map;
    }

    public eb(h61 h61Var) {
        this.A = 13;
        this.B = h61Var;
        this.L = new md4();
        new LinkedHashSet();
        this.R = new LinkedHashSet();
        this.X = new LinkedHashSet();
    }

    public eb(kh0 kh0Var, ze0 ze0Var, aj0 aj0Var, rr6 rr6Var) {
        this.A = 4;
        kh0Var.getClass();
        ze0Var.getClass();
        aj0Var.getClass();
        rr6Var.getClass();
        this.B = kh0Var;
        this.L = ze0Var;
        this.R = aj0Var;
        this.X = rr6Var;
    }

    public eb(Typeface typeface, q54 q54Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.A = 12;
        this.X = typeface;
        this.B = q54Var;
        this.R = new r54(1024);
        int a = q54Var.a(6);
        if (a != 0) {
            int i5 = a + q54Var.A;
            i = ((ByteBuffer) q54Var.R).getInt(((ByteBuffer) q54Var.R).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.L = new char[i * 2];
        int a2 = q54Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + q54Var.A;
            i2 = ((ByteBuffer) q54Var.R).getInt(((ByteBuffer) q54Var.R).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            re7 re7Var = new re7(this, i7);
            p54 b = re7Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.R).getInt(a3 + b.A) : 0, (char[]) this.L, i7 * 2);
            p54 b2 = re7Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.A;
                i3 = ((ByteBuffer) b2.R).getInt(((ByteBuffer) b2.R).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            np2.s("invalid metadata codepoint length", i3 > 0);
            r54 r54Var = (r54) this.R;
            p54 b3 = re7Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.A;
                i4 = ((ByteBuffer) b3.R).getInt(((ByteBuffer) b3.R).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            r54Var.a(re7Var, 0, i4 - 1);
        }
    }

    public eb(d51 d51Var, rr6 rr6Var) {
        this.A = 23;
        d51Var.getClass();
        this.B = d51Var;
        this.L = rr6Var;
        this.R = new Object();
        this.X = new LinkedHashMap();
    }

    public eb(n55 n55Var, t57 t57Var, rc3 rc3Var) {
        this.A = 3;
        n55Var.getClass();
        t57Var.getClass();
        rc3Var.getClass();
        this.B = n55Var;
        this.L = t57Var;
        this.R = rc3Var;
        this.X = f04.p(new z(this, (r41) null, 10));
    }

    public eb(Context context, ActionMode.Callback callback) {
        this.A = 21;
        this.L = context;
        this.B = callback;
        this.R = new ArrayList();
        this.X = new ci6(0);
    }

    public eb(xk4 xk4Var, xp2 xp2Var, xp2 xp2Var2, xp2 xp2Var3) {
        this.A = 6;
        xk4Var.getClass();
        this.B = xk4Var;
        this.L = xp2Var;
        this.R = xp2Var2;
        this.X = xp2Var3;
    }

    public eb(gb gbVar) {
        this.A = 0;
        this.X = gbVar;
    }

    public eb(long j, long j2, long j3) {
        this.A = 22;
        this.B = np2.Y(new xi6(j));
        this.L = np2.Y(new jk4(j2));
        this.R = np2.Y(new jk4(j3));
        this.X = np2.Y(new jk4(j2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eb(xd2 xd2Var) {
        this(new j97(xd2Var, 7), 25);
        this.A = 25;
    }
}
