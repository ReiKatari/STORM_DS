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
import androidx.preference.Preference;
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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q9  reason: default package */
/* loaded from: classes.dex */
public final class q9 implements wf6, qx, cb6, m77 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;
    public Object X;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7 */
    public q9(aw2 aw2Var, Size size, CameraCharacteristics cameraCharacteristics, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        vx3 ka3Var;
        zh0 zh0Var;
        vx3 vx3Var;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        vx3 vx3Var2;
        this.A = 10;
        nk2.s();
        this.B = aw2Var;
        mg0 mg0Var = (mg0) aw2Var.d(b57.I, null);
        if (mg0Var != null) {
            int i3 = 0;
            vh0 vh0Var = new vh0(0);
            mg0Var.a(aw2Var, vh0Var);
            vh0Var.h();
            os osVar = new os(9, false);
            this.L = osVar;
            Executor executor = (Executor) aw2Var.d(q53.y, iq2.s());
            Objects.requireNonNull(executor);
            qh qhVar = new qh(executor, cameraCharacteristics);
            this.R = qhVar;
            ArrayList arrayList = new ArrayList();
            if (((Integer) aw2Var.d(fw2.m, 0)).intValue() != 0) {
                arrayList.add(32);
                arrayList.add(256);
            } else {
                Integer num = (Integer) aw2Var.d(aw2.R, null);
                if (num != null) {
                    i = num.intValue();
                } else {
                    Integer num2 = (Integer) aw2Var.d(fw2.l, null);
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
            int x = aw2Var.x();
            if (aw2Var.d(aw2.Y, null) == null) {
                dn1 dn1Var = new dn1();
                dn1 dn1Var2 = new dn1();
                tw twVar = new tw(size, x, arrayList, z, dn1Var, dn1Var2);
                this.X = twVar;
                if (((tw) osVar.R) == null && ((e55) osVar.B) == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                nl2.D("CaptureNode does not support recreation yet.", z2);
                osVar.R = twVar;
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
                        vx3Var2 = new vx3(size.getWidth(), size.getHeight(), 256, 4);
                        jv3.s(obj, vx3Var2.B);
                        vx3Var = new vx3(size.getWidth(), size.getHeight(), 32, 4);
                        jv3.s(obj, vx3Var.B);
                    } else {
                        z7 = true;
                        i2 = 0;
                        vx3 vx3Var3 = new vx3(size.getWidth(), size.getHeight(), x, 4);
                        jv3.s(obj, vx3Var3.B);
                        vx3Var2 = vx3Var3;
                        vx3Var = null;
                    }
                    i3 = i2;
                    zh0Var = new zh0(osVar, i3);
                    z4 = z7;
                    ka3Var = vx3Var2;
                } else {
                    z4 = true;
                    ka3Var = new ka3(17, mj2.q(size.getWidth(), size.getHeight(), x, 4));
                    zh0Var = new zh0(osVar, 1);
                    vx3Var = null;
                }
                Surface surface = ka3Var.getSurface();
                Objects.requireNonNull(surface);
                if (twVar.a == null) {
                    z5 = z4;
                } else {
                    z5 = i3;
                }
                nl2.D("The surface is already set.", z5);
                twVar.a = new kx2(surface, size, x);
                osVar.B = new e55(ka3Var);
                ka3Var.g(new i(osVar), iq2.x());
                if (z3 && vx3Var != null) {
                    Surface surface2 = vx3Var.getSurface();
                    if (twVar.b == null) {
                        z6 = z4;
                    } else {
                        z6 = false;
                    }
                    nl2.D("The secondary surface is already set.", z6);
                    twVar.b = new kx2(surface2, size, x);
                    osVar.L = new e55(vx3Var);
                    vx3Var.g(new i(osVar), iq2.x());
                }
                dn1Var.b = zh0Var;
                dn1Var2.b = new zh0(osVar, 2);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = (IncorrectJpegMetadataQuirk) ((ox4) qhVar.R).b(IncorrectJpegMetadataQuirk.class);
                return;
            }
            c44.b();
            throw null;
        }
        f81.A((String) aw2Var.d(an6.z, aw2Var.toString()), "Implementation is missing option unpacker for ");
        throw null;
    }

    public static void K(q9 q9Var, t45 t45Var, w45 w45Var, t45 t45Var2, int i) {
        t71 t71Var;
        if ((i & 1) != 0) {
            t45Var = null;
        }
        if ((i & 2) != 0) {
            w45Var = null;
        }
        if ((i & 4) != 0) {
            t45Var2 = null;
        }
        q9Var.getClass();
        TimeZone timeZone = ik7.a;
        boolean isShutdown = ((ThreadPoolExecutor) q9Var.z()).isShutdown();
        synchronized (q9Var) {
            if (w45Var != null) {
                try {
                    if (!((ArrayDeque) q9Var.X).remove(w45Var)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (t45Var2 != null) {
                t45Var2.B.decrementAndGet();
                if (!((ArrayDeque) q9Var.R).remove(t45Var2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (t45Var != null) {
                ((ArrayDeque) q9Var.L).add(t45Var);
                t45 A = q9Var.A(((hu2) t45Var.L.B.B).d);
                if (A != null) {
                    t45Var.B = A.B;
                }
            }
            if ((w45Var != null || t45Var2 != null) && (isShutdown || ((ArrayDeque) q9Var.R).isEmpty())) {
                ((ArrayDeque) q9Var.X).isEmpty();
            }
            if (isShutdown) {
                List n1 = tq0.n1((ArrayDeque) q9Var.L);
                ((ArrayDeque) q9Var.L).clear();
                t71Var = new t71(7, n1);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) q9Var.L).iterator();
                it.getClass();
                while (it.hasNext()) {
                    t45 t45Var3 = (t45) it.next();
                    if (((ArrayDeque) q9Var.R).size() >= 64) {
                        break;
                    } else if (t45Var3.B.get() < 5) {
                        it.remove();
                        t45Var3.B.incrementAndGet();
                        arrayList.add(t45Var3);
                        ((ArrayDeque) q9Var.R).add(t45Var3);
                    }
                }
                t71Var = new t71(7, arrayList);
            }
        }
        int size = ((List) t71Var.B).size();
        for (int i2 = 0; i2 < size; i2++) {
            t45 t45Var4 = (t45) ((List) t71Var.B).get(i2);
            if (t45Var4 != t45Var) {
                w45 w45Var2 = t45Var4.L;
            }
            if (isShutdown) {
                t45Var4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                w45 w45Var3 = t45Var4.L;
                w45Var3.k(interruptedIOException);
                t45Var4.A.k(w45Var3, interruptedIOException);
            } else {
                ExecutorService z = q9Var.z();
                t45Var4.getClass();
                w45 w45Var4 = t45Var4.L;
                w45Var4.A.a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) z).execute(t45Var4);
                    } catch (Throwable th2) {
                        q9 q9Var2 = w45Var4.A.a;
                        q9Var2.getClass();
                        K(q9Var2, null, null, t45Var4, 3);
                        throw th2;
                    }
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e);
                    w45 w45Var5 = t45Var4.L;
                    w45Var5.k(interruptedIOException2);
                    t45Var4.A.k(w45Var5, interruptedIOException2);
                    q9 q9Var3 = w45Var4.A.a;
                    q9Var3.getClass();
                    K(q9Var3, null, null, t45Var4, 3);
                }
            }
        }
    }

    public static void e(q9 q9Var, d54 d54Var) {
        q9Var.getClass();
        d54Var.getClass();
        if (((LinkedHashSet) q9Var.R).add(d54Var)) {
            g54 g54Var = (g54) q9Var.L;
            g54Var.getClass();
            if (d54Var.c == null) {
                g54Var.e.addFirst(d54Var);
                d54Var.c = q9Var;
                g54Var.b();
                return;
            }
            c44.t(d54Var, "' is already registered with a dispatcher", "Handler '");
        }
    }

    public t45 A(String str) {
        Iterator it = ((ArrayDeque) this.R).iterator();
        it.getClass();
        while (it.hasNext()) {
            t45 t45Var = (t45) it.next();
            if (b53.x(((hu2) t45Var.L.B.B).d, str)) {
                return t45Var;
            }
        }
        Iterator it2 = ((ArrayDeque) this.L).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            t45 t45Var2 = (t45) it2.next();
            if (b53.x(((hu2) t45Var2.L.B.B).d, str)) {
                return t45Var2;
            }
        }
        return null;
    }

    public ni6 B(j8 j8Var) {
        ArrayList arrayList = (ArrayList) this.R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ni6 ni6Var = (ni6) arrayList.get(i);
            if (ni6Var != null && ni6Var.b == j8Var) {
                return ni6Var;
            }
        }
        ni6 ni6Var2 = new ni6((Context) this.L, j8Var);
        arrayList.add(ni6Var2);
        return ni6Var2;
    }

    public o31 C() {
        o31 o31Var = (o31) ((ki2) this.R).c();
        if (o31Var != null) {
            return o31Var;
        }
        i.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public oo D(oo ooVar, oo ooVar2) {
        q9 q9Var = this;
        if (((oo) q9Var.X) == null) {
            q9Var.X = ooVar.c();
        }
        oo ooVar3 = (oo) q9Var.X;
        if (ooVar3 != null) {
            int b = ooVar3.b();
            int i = 0;
            while (true) {
                oo ooVar4 = (oo) q9Var.X;
                if (i < b) {
                    if (ooVar4 != null) {
                        float a = ooVar.a(i);
                        float a2 = ooVar2.a(i);
                        ou ouVar = (ou) ((dz4) q9Var.B).A;
                        double b2 = ouVar.b(a2);
                        double d = c92.a;
                        float f = ouVar.a * ouVar.b;
                        ooVar4.e(i, (Math.signum(a2) * ((float) (Math.exp((d / (d - 1.0d)) * b2) * f))) + a);
                        i++;
                        q9Var = this;
                        b = b;
                    } else {
                        b53.g0("targetVector");
                        throw null;
                    }
                } else if (ooVar4 != null) {
                    return ooVar4;
                } else {
                    b53.g0("targetVector");
                    throw null;
                }
            }
        } else {
            b53.g0("targetVector");
            throw null;
        }
    }

    public oo E(long j, oo ooVar, oo ooVar2) {
        float f;
        if (((oo) this.R) == null) {
            this.R = ooVar.c();
        }
        oo ooVar3 = (oo) this.R;
        if (ooVar3 != null) {
            int b = ooVar3.b();
            int i = 0;
            while (true) {
                oo ooVar4 = (oo) this.R;
                if (i < b) {
                    if (ooVar4 != null) {
                        ooVar.getClass();
                        long j2 = j / 1000000;
                        b92 a = ((ou) ((dz4) this.B).A).a(ooVar2.a(i));
                        long j3 = a.c;
                        if (j3 > 0) {
                            f = ((float) j2) / ((float) j3);
                        } else {
                            f = 1.0f;
                        }
                        ooVar4.e(i, (((Math.signum(a.a) * eh.a(f).b) * a.b) / ((float) j3)) * 1000.0f);
                        i++;
                    } else {
                        b53.g0("velocityVector");
                        throw null;
                    }
                } else if (ooVar4 != null) {
                    return ooVar4;
                } else {
                    b53.g0("velocityVector");
                    throw null;
                }
            }
        } else {
            b53.g0("velocityVector");
            throw null;
        }
    }

    public ra7 F(qo0 qo0Var, String str) {
        ra7 ra7Var;
        ra7 a;
        synchronized (((so1) this.X)) {
            try {
                za7 za7Var = (za7) this.B;
                za7Var.getClass();
                ra7Var = (ra7) za7Var.a.get(str);
                if (qo0Var.d(ra7Var)) {
                    xa7 xa7Var = (xa7) this.L;
                    if (xa7Var instanceof bu5) {
                        bu5 bu5Var = (bu5) xa7Var;
                        ra7Var.getClass();
                        rm3 rm3Var = bu5Var.d;
                        if (rm3Var != null) {
                            xt5 xt5Var = bu5Var.e;
                            xt5Var.getClass();
                            mj2.k(ra7Var, xt5Var, rm3Var);
                        }
                    }
                    ra7Var.getClass();
                } else {
                    g14 g14Var = new g14((z31) this.R);
                    g14Var.a.put(bq0.X, str);
                    xa7 xa7Var2 = (xa7) this.L;
                    xa7Var2.getClass();
                    try {
                        try {
                            a = xa7Var2.c(qo0Var, g14Var);
                        } catch (AbstractMethodError unused) {
                            Class cls = qo0Var.a;
                            cls.getClass();
                            a = xa7Var2.b(cls, g14Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = qo0Var.a;
                        cls2.getClass();
                        a = xa7Var2.a(cls2);
                    }
                    ra7Var = a;
                    za7 za7Var2 = (za7) this.B;
                    za7Var2.getClass();
                    ra7Var.getClass();
                    ra7 ra7Var2 = (ra7) za7Var2.a.put(str, ra7Var);
                    if (ra7Var2 != null) {
                        ra7Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ra7Var;
    }

    public int G() {
        return ((cc6) this.R).A.length();
    }

    public long H() {
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

    public boolean I(j8 j8Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.B).onActionItemClicked(B(j8Var), new dx3((Context) this.L, (ri6) menuItem));
    }

    public boolean J(j8 j8Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.B;
        ni6 B = B(j8Var);
        m66 m66Var = (m66) this.X;
        Menu menu2 = (Menu) m66Var.get(menu);
        if (menu2 == null) {
            menu2 = new px3((Context) this.L, (uw3) menu);
            m66Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(B, menu2);
    }

    public void L(vy0 vy0Var, int i) {
        Class<?> cls = vy0Var.getClass();
        au3 au3Var = (au3) this.B;
        k30 k30Var = (k30) au3Var.g.a.get(cls);
        if (k30Var != null) {
            Object a = k30Var.a(au3Var, (u93) this.L);
            cc6 cc6Var = (cc6) this.R;
            StringBuilder sb = cc6Var.A;
            int length = sb.length();
            int length2 = sb.length();
            if (length > i && i >= 0 && length <= length2) {
                cc6.c(cc6Var, a, i, length);
            }
        }
    }

    public void M(long j, t35 t35Var, u35 u35Var) {
        m35 m35Var;
        t35Var.getClass();
        u35Var.getClass();
        synchronized (this.B) {
            try {
                Object value = ((ee6) this.R).getValue();
                if (value instanceof m35) {
                    m35Var = (m35) value;
                } else {
                    m35Var = null;
                }
                if (m35Var != null && m35Var.a == j) {
                    ee6 ee6Var = (ee6) this.R;
                    l35 l35Var = new l35(j, t35Var, u35Var, m35Var.c);
                    ee6Var.getClass();
                    ee6Var.l(null, l35Var);
                }
            } finally {
            }
        }
    }

    public void N(td6 td6Var) {
        td6Var.getClass();
        xc4 xc4Var = new xc4(8, this, td6Var);
        synchronized (this.R) {
            Runnable runnable = (Runnable) ((LinkedHashMap) this.X).put(td6Var, xc4Var);
        }
        ((Handler) ((t71) this.B).B).postDelayed(xc4Var, 5400000L);
    }

    public void O(vy0 vy0Var) {
        du3 du3Var = (du3) ((Map) this.X).get(vy0Var.getClass());
        if (du3Var != null) {
            du3Var.a(this, vy0Var);
        } else {
            P(vy0Var);
        }
    }

    public void P(vy0 vy0Var) {
        for (vy0 vy0Var2 = (vy0) vy0Var.c; vy0Var2 != null; vy0Var2 = (vy0) vy0Var2.f) {
            vy0Var2.a(this);
        }
    }

    @Override // defpackage.j77
    public long b(oo ooVar, oo ooVar2, oo ooVar3) {
        int b = ooVar.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((u57) this.B).f(i).d(ooVar.a(i), ooVar2.a(i), ooVar3.a(i)));
        }
        return j;
    }

    @Override // defpackage.wf6
    public synchronized void c(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() == ((ab) this.X).e()) {
            if (byteBuffer.get() == ((ab) this.X).e()) {
                this.R = new byte[7];
                byte[] bArr2 = new byte[((ab) this.X).a];
                byteBuffer.get(bArr2);
                byteBuffer.get((byte[]) this.R);
                ab abVar = (ab) this.X;
                this.B = new SecretKeySpec(nl2.F(abVar.d, abVar.e, bArr2, bArr, abVar.a), "AES");
                this.L = (Cipher) a02.e.a("AES/GCM/NoPadding");
            } else {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
    }

    @Override // defpackage.wf6
    public synchronized void d(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        ((Cipher) this.L).init(2, (SecretKeySpec) this.B, ab.i((byte[]) this.R, i, z));
        ((Cipher) this.L).doFinal(byteBuffer, byteBuffer2);
    }

    public void f(f54 f54Var) {
        if (((LinkedHashSet) this.X).add(f54Var)) {
            ((g54) this.L).a(this, f54Var, -1);
        }
    }

    public void g(cc4 cc4Var, int i) {
        if (i != 1 && i != 0) {
            i.g(wh1.g(i, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.X).add(cc4Var)) {
            ((g54) this.L).a(this, cc4Var, i);
        }
    }

    public void h(String str, String str2) {
        String str3;
        if (((String) this.X).length() == 0) {
            str3 = "?";
        } else {
            str3 = "&";
        }
        this.X = ((String) this.X) + str3 + str + '=' + str2;
    }

    public void i(vy0 vy0Var) {
        if (((vy0) vy0Var.f) != null) {
            y();
            ((cc6) this.R).a('\n');
        }
    }

    @Override // defpackage.cb6
    public sb6 j() {
        return (gb1) this.R;
    }

    @Override // defpackage.j77
    public oo l(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        if (((oo) this.R) == null) {
            this.R = ooVar3.c();
        }
        oo ooVar4 = (oo) this.R;
        if (ooVar4 != null) {
            int b = ooVar4.b();
            int i = 0;
            while (true) {
                oo ooVar5 = (oo) this.R;
                if (i < b) {
                    if (ooVar5 != null) {
                        ooVar5.e(i, ((u57) this.B).f(i).c(j, ooVar.a(i), ooVar2.a(i), ooVar3.a(i)));
                        i++;
                    } else {
                        b53.g0("velocityVector");
                        throw null;
                    }
                } else if (ooVar5 != null) {
                    return ooVar5;
                } else {
                    b53.g0("velocityVector");
                    throw null;
                }
            }
        } else {
            b53.g0("velocityVector");
            throw null;
        }
    }

    public void m(td6 td6Var) {
        Runnable runnable;
        td6Var.getClass();
        synchronized (this.R) {
            runnable = (Runnable) ((LinkedHashMap) this.X).remove(td6Var);
        }
        if (runnable != null) {
            ((Handler) ((t71) this.B).B).removeCallbacks(runnable);
        }
    }

    @Override // defpackage.cb6
    public g76 n() {
        return (fb1) this.X;
    }

    @Override // defpackage.j77
    public oo p(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        if (((oo) this.L) == null) {
            this.L = ooVar.c();
        }
        oo ooVar4 = (oo) this.L;
        if (ooVar4 != null) {
            int b = ooVar4.b();
            int i = 0;
            while (true) {
                oo ooVar5 = (oo) this.L;
                if (i < b) {
                    if (ooVar5 != null) {
                        ooVar5.e(i, ((u57) this.B).f(i).b(j, ooVar.a(i), ooVar2.a(i), ooVar3.a(i)));
                        i++;
                    } else {
                        b53.g0("valueVector");
                        throw null;
                    }
                } else if (ooVar5 != null) {
                    return ooVar5;
                } else {
                    b53.g0("valueVector");
                    throw null;
                }
            }
        } else {
            b53.g0("valueVector");
            throw null;
        }
    }

    @Override // defpackage.j77
    public oo q(oo ooVar, oo ooVar2, oo ooVar3) {
        if (((oo) this.X) == null) {
            this.X = ooVar3.c();
        }
        oo ooVar4 = (oo) this.X;
        if (ooVar4 != null) {
            int b = ooVar4.b();
            int i = 0;
            while (true) {
                oo ooVar5 = (oo) this.X;
                if (i < b) {
                    if (ooVar5 != null) {
                        ooVar5.e(i, ((u57) this.B).f(i).e(ooVar.a(i), ooVar2.a(i), ooVar3.a(i)));
                        i++;
                    } else {
                        b53.g0("endVelocityVector");
                        throw null;
                    }
                } else if (ooVar5 != null) {
                    return ooVar5;
                } else {
                    b53.g0("endVelocityVector");
                    throw null;
                }
            }
        } else {
            b53.g0("endVelocityVector");
            throw null;
        }
    }

    public void r(long j) {
        synchronized (this.B) {
            Long p = nl2.p((n35) ((ee6) this.R).getValue());
            if (p != null && p.longValue() == j) {
                ee6 ee6Var = (ee6) this.R;
                k35 k35Var = k35.a;
                ee6Var.getClass();
                ee6Var.l(null, k35Var);
            }
        }
    }

    public void s() {
        kx2 kx2Var;
        nk2.s();
        os osVar = (os) this.L;
        osVar.getClass();
        nk2.s();
        tw twVar = (tw) osVar.R;
        Objects.requireNonNull(twVar);
        e55 e55Var = (e55) osVar.B;
        Objects.requireNonNull(e55Var);
        e55 e55Var2 = (e55) osVar.L;
        kx2 kx2Var2 = twVar.a;
        Objects.requireNonNull(kx2Var2);
        kx2Var2.a();
        kx2 kx2Var3 = twVar.a;
        Objects.requireNonNull(kx2Var3);
        jv3.N(kx2Var3.e).a(new ai0(e55Var, 0), iq2.x());
        kx2 kx2Var4 = twVar.c;
        if (kx2Var4 != null) {
            kx2Var4.a();
            jv3.N(twVar.c.e).a(new ai0(null, 1), iq2.x());
        }
        if (twVar.f.size() > 1 && (kx2Var = twVar.b) != null) {
            kx2Var.a();
            jv3.N(twVar.b.e).a(new ai0(e55Var2, 2), iq2.x());
        }
        ((qh) this.R).getClass();
    }

    public i35 t() {
        n35 n35Var = (n35) ((ee6) this.R).getValue();
        if (b53.x(n35Var, k35.a)) {
            return null;
        }
        if (n35Var instanceof j35) {
            return nl2.r(((j35) n35Var).c);
        }
        if (n35Var instanceof m35) {
            return ((m35) n35Var).c;
        }
        if (n35Var instanceof l35) {
            return ((l35) n35Var).d;
        }
        i.c();
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
                return wh1.m(sb, ((int[]) this.X).length, " files");
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
            ArrayList arrayList2 = (ArrayList) ((m66) this.L).get(obj);
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
        f81.w("This graph contains cyclic dependencies");
    }

    public void v(f54 f54Var, b54 b54Var) {
        g54 g54Var = (g54) this.L;
        g54Var.getClass();
        if (g54Var.g == 0) {
            d54 c = g54Var.c(-1);
            g54Var.f = c;
            g54Var.g = -1;
            g54Var.h = f54Var;
            if (b54Var != null) {
                if (c != null) {
                    c.d(b54Var);
                }
                ee6 ee6Var = g54Var.a;
                i54 i54Var = new i54(b54Var);
                ee6Var.getClass();
                ee6Var.l(null, i54Var);
            }
        }
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
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(long r9, long r11, defpackage.k11 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.v54
            if (r0 == 0) goto L14
            r0 = r13
            v54 r0 = (defpackage.v54) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            v54 r0 = new v54
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r13.Y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.me2.a0(r0)
            goto L74
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r3
        L33:
            defpackage.me2.a0(r0)
            goto L59
        L37:
            defpackage.me2.a0(r0)
            java.lang.Object r0 = r8.B
            a64 r0 = (defpackage.a64) r0
            if (r0 == 0) goto L45
            a64 r0 = r0.S0()
            goto L46
        L45:
            r0 = r3
        L46:
            r6 = 0
            if (r0 != 0) goto L5e
            java.lang.Object r8 = r8.L
            a64 r8 = (defpackage.a64) r8
            if (r8 == 0) goto L78
            r13.Y = r5
            java.lang.Object r0 = r8.o0(r9, r11, r13)
            if (r0 != r1) goto L59
            goto L73
        L59:
            p77 r0 = (defpackage.p77) r0
            long r6 = r0.a
            goto L78
        L5e:
            java.lang.Object r8 = r8.B
            a64 r8 = (defpackage.a64) r8
            if (r8 == 0) goto L68
            a64 r3 = r8.S0()
        L68:
            r8 = r3
            if (r8 == 0) goto L78
            r13.Y = r4
            java.lang.Object r0 = r8.o0(r9, r11, r13)
            if (r0 != r1) goto L74
        L73:
            return r1
        L74:
            p77 r0 = (defpackage.p77) r0
            long r6 = r0.a
        L78:
            p77 r8 = new p77
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q9.w(long, long, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(long r6, defpackage.k11 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.w54
            if (r0 == 0) goto L13
            r0 = r8
            w54 r0 = (defpackage.w54) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            w54 r0 = new w54
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r8)
            goto L46
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2e:
            defpackage.me2.a0(r8)
            java.lang.Object r5 = r5.B
            a64 r5 = (defpackage.a64) r5
            if (r5 == 0) goto L3b
            a64 r3 = r5.S0()
        L3b:
            if (r3 == 0) goto L4b
            r0.Y = r4
            java.lang.Object r8 = r3.m0(r6, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            p77 r8 = (defpackage.p77) r8
            long r5 = r8.a
            goto L4d
        L4b:
            r5 = 0
        L4d:
            p77 r7 = new p77
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q9.x(long, k11):java.lang.Object");
    }

    public void y() {
        cc6 cc6Var = (cc6) this.R;
        StringBuilder sb = cc6Var.A;
        if (sb.length() > 0 && '\n' != sb.charAt(sb.length() - 1)) {
            cc6Var.a('\n');
        }
    }

    public synchronized ExecutorService z() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.B) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.B = new ThreadPoolExecutor(0, (int) Preference.DEFAULT_ORDER, 60L, timeUnit, synchronousQueue, new hk7(ik7.b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.B;
            threadPoolExecutor.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public q9(t71 t71Var, wv6 wv6Var) {
        this.A = 23;
        t71Var.getClass();
        this.B = t71Var;
        this.L = wv6Var;
        this.R = new Object();
        this.X = new LinkedHashMap();
    }

    public /* synthetic */ q9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }

    public q9(int i) {
        this.A = i;
        switch (i) {
            case 8:
                this.B = new pq4(10);
                this.L = new m66(0);
                this.R = new ArrayList();
                this.X = new HashSet();
                return;
            case 9:
                this.L = new ArrayDeque();
                this.R = new ArrayDeque();
                this.X = new ArrayDeque();
                return;
            case 14:
                this.R = new dj(13, this);
                return;
            case ig7.e /* 15 */:
                this.B = new ArrayList();
                this.L = new ArrayList();
                this.R = new ArrayList();
                this.X = vh1.p;
                return;
            case 17:
                this.B = new Object();
                this.L = new AtomicLong(1L);
                ee6 a = fe6.a(k35.a);
                this.R = a;
                this.X = new q45(a);
                return;
            case 24:
                this.B = new m66(0);
                this.L = new SparseArray();
                this.R = new cs3((Object) null);
                this.X = new m66(0);
                return;
            default:
                return;
        }
    }

    public q9(za7 za7Var, xa7 xa7Var, z31 z31Var) {
        this.A = 27;
        za7Var.getClass();
        xa7Var.getClass();
        z31Var.getClass();
        this.B = za7Var;
        this.L = xa7Var;
        this.R = z31Var;
        this.X = new so1(23);
    }

    public q9(q9 q9Var) {
        this.A = 16;
        LinkedHashSet linkedHashSet = vh1.p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) q9Var.B);
        for (Class cls : (LinkedHashSet) q9Var.X) {
            arrayList.add(vh1.q.get(cls));
        }
        this.B = arrayList;
        this.R = new jo1(15);
        this.X = (ArrayList) q9Var.R;
        ArrayList arrayList2 = (ArrayList) q9Var.L;
        this.L = arrayList2;
        new sz2(new k91(arrayList2, Collections.EMPTY_MAP));
    }

    public q9(Socket socket) {
        this.A = 7;
        this.B = socket;
        this.L = new AtomicInteger();
        this.R = new gb1(this);
        this.X = new fb1(this);
    }

    public q9(ee eeVar, xx xxVar) {
        this.A = 2;
        this.B = eeVar;
        this.L = xxVar;
        AutofillManager i = i2.i(eeVar.getContext().getSystemService(i2.l()));
        if (i != null) {
            this.R = i;
            eeVar.setImportantForAutofill(1);
            s2 u = me2.u(eeVar);
            AutofillId b = u != null ? rx.b(u.b) : null;
            if (b != null) {
                this.X = b;
                return;
            }
            throw b31.e("Required value was null.");
        }
        i.n("Autofill service could not be located.");
        throw null;
    }

    public q9(m93 m93Var) {
        this.A = 18;
        this.R = "";
        this.X = "";
        this.B = m93Var;
        this.L = m93Var.e().b();
    }

    public q9(au3 au3Var, u93 u93Var, cc6 cc6Var, Map map, iq0 iq0Var) {
        this.A = 11;
        this.B = au3Var;
        this.L = u93Var;
        this.R = cc6Var;
        this.X = map;
    }

    public q9(a31 a31Var) {
        this.A = 13;
        this.B = a31Var;
        this.L = new g54();
        new LinkedHashSet();
        this.R = new LinkedHashSet();
        this.X = new LinkedHashSet();
    }

    public q9(bf0 bf0Var, qc0 qc0Var, rg0 rg0Var, ci3 ci3Var) {
        this.A = 5;
        bf0Var.getClass();
        qc0Var.getClass();
        rg0Var.getClass();
        ci3Var.getClass();
        this.B = bf0Var;
        this.L = qc0Var;
        this.R = rg0Var;
        this.X = ci3Var;
    }

    public q9(Typeface typeface, xx3 xx3Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.A = 12;
        this.X = typeface;
        this.B = xx3Var;
        this.R = new yx3(1024);
        int a = xx3Var.a(6);
        if (a != 0) {
            int i5 = a + xx3Var.A;
            i = ((ByteBuffer) xx3Var.R).getInt(((ByteBuffer) xx3Var.R).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.L = new char[i * 2];
        int a2 = xx3Var.a(6);
        if (a2 != 0) {
            int i6 = a2 + xx3Var.A;
            i2 = ((ByteBuffer) xx3Var.R).getInt(((ByteBuffer) xx3Var.R).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            w07 w07Var = new w07(this, i7);
            wx3 b = w07Var.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.R).getInt(a3 + b.A) : 0, (char[]) this.L, i7 * 2);
            wx3 b2 = w07Var.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.A;
                i3 = ((ByteBuffer) b2.R).getInt(((ByteBuffer) b2.R).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            nl2.y("invalid metadata codepoint length", i3 > 0);
            yx3 yx3Var = (yx3) this.R;
            wx3 b3 = w07Var.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.A;
                i4 = ((ByteBuffer) b3.R).getInt(((ByteBuffer) b3.R).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            yx3Var.a(w07Var, 0, i4 - 1);
        }
    }

    public /* synthetic */ q9(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    public q9(fw4 fw4Var, ct6 ct6Var, c63 c63Var) {
        this.A = 4;
        fw4Var.getClass();
        ct6Var.getClass();
        c63Var.getClass();
        this.B = fw4Var;
        this.L = ct6Var;
        this.R = c63Var;
        this.X = se.k(new y(this, (j11) null, 10));
    }

    public q9(Context context, ActionMode.Callback callback) {
        this.A = 21;
        this.L = context;
        this.B = callback;
        this.R = new ArrayList();
        this.X = new m66(0);
    }

    public q9(ab abVar) {
        this.A = 1;
        this.X = abVar;
    }

    public q9(long j, long j2, long j3) {
        this.A = 22;
        this.B = me2.G(new i76(j));
        this.L = me2.G(new mb4(j2));
        this.R = me2.G(new mb4(j3));
        this.X = me2.G(new mb4(j2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q9(f92 f92Var) {
        this(25, new u57(3, f92Var));
        this.A = 25;
    }
}
