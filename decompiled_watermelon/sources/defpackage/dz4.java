package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Region;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dz4  reason: default package */
/* loaded from: classes.dex */
public class dz4 implements os1, f22, ms5, xi6, oj2, d3, ys {
    public Object A;

    public dz4(int i) {
        switch (i) {
            case 4:
                this.A = me2.G(Boolean.FALSE);
                return;
            case 5:
                this.A = new Region();
                return;
            case 23:
                this.A = new il6(new zv5(4, this));
                return;
            default:
                this.A = new AtomicBoolean(false);
                return;
        }
    }

    public void A() {
        View view;
        View view2 = (View) this.A;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new jb6(view, 0));
            }
        }
    }

    @Override // defpackage.f22
    public x45 a() {
        or5 b;
        boolean z;
        IOException iOException = null;
        while (!((h55) this.A).k.k0) {
            try {
                b = ((h55) this.A).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    pu.k(iOException, e);
                }
                if (!((h55) this.A).a(null)) {
                    throw iOException;
                }
            }
            if (!b.e()) {
                nr5 g = b.g();
                if (g.b == null && g.c == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    g = b.c();
                }
                or5 or5Var = g.b;
                Throwable th = g.c;
                if (th == null) {
                    if (or5Var != null) {
                        ((h55) this.A).p.addFirst(or5Var);
                    }
                } else {
                    throw th;
                }
            }
            return b.d();
        }
        f81.j("Canceled");
        return null;
    }

    @Override // defpackage.ms5
    public ls5 b(String str) {
        str.getClass();
        vi6 vi6Var = (vi6) this.A;
        String databaseName = vi6Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                i.g(wh1.A("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !zg6.U0('/', databaseName, databaseName).equals(zg6.U0('/', str, str))) {
            c44.l("This driver is configured to open a database named '", vi6Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new si6(vi6Var.e0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.Parcelable, bp5, java.lang.Object] */
    @Override // defpackage.os1
    public void c(rg5 rg5Var) {
        rg5Var.getClass();
        int i = EmulatorActivity.P1;
        RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.A;
        Intent intent = new Intent(romDetailsActivity, EmulatorActivity.class);
        ?? obj = new Object();
        obj.A = rg5Var;
        intent.putExtra("rom", (Parcelable) obj);
        romDetailsActivity.startActivity(intent);
        romDetailsActivity.overridePendingTransition(17432576, 17432577);
    }

    @Override // defpackage.d3
    public boolean d(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A;
        boolean z = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z = true;
        }
        int i = swipeDismissBehavior.d;
        if ((i == 0 && z) || (i == 1 && !z)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        WeakHashMap weakHashMap = aa7.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(RecyclerView.A1);
        return true;
    }

    @Override // defpackage.f22
    public h55 e() {
        return (h55) this.A;
    }

    @Override // defpackage.xi6
    public String f() {
        return ((aj6) this.A).B;
    }

    @Override // defpackage.xi6
    public void i(wi6 wi6Var) {
        aj6 aj6Var = (aj6) this.A;
        int length = aj6Var.R.length;
        for (int i = 1; i < length; i++) {
            int i2 = aj6Var.R[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                wi6Var.e(i);
                            }
                        } else {
                            byte[] bArr = aj6Var.c0[i];
                            bArr.getClass();
                            wi6Var.j(i, bArr);
                        }
                    } else {
                        String str = aj6Var.Z[i];
                        str.getClass();
                        wi6Var.t(i, str);
                    }
                } else {
                    wi6Var.v(aj6Var.Y[i], i);
                }
            } else {
                wi6Var.g(i, aj6Var.X[i]);
            }
        }
    }

    @Override // defpackage.ms5
    public boolean k() {
        return true;
    }

    @Override // defpackage.oj2
    public void l(Object obj) {
        Void r1 = (Void) obj;
        ((qj6) this.A).run();
    }

    @Override // defpackage.ys
    public Object m(dw5 dw5Var, Float f, Float f2, mi2 mi2Var, aa6 aa6Var) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object g = sn2.g(dw5Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, dt3.f(RecyclerView.A1, floatValue2, 28), (sc6) this.A, mi2Var, aa6Var);
        if (g == p31.COROUTINE_SUSPENDED) {
            return g;
        }
        return (eo) g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(defpackage.k11 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.k16
            if (r0 == 0) goto L13
            r0 = r5
            k16 r0 = (defpackage.k16) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            k16 r0 = new k16
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r0 = r0.Y
            r1 = 0
            if (r0 == 0) goto L3f
            r2 = 1
            if (r0 != r2) goto L39
            defpackage.me2.a0(r5)
            java.lang.Object r4 = r4.A
            fw r4 = (defpackage.fw) r4
            j16 r5 = defpackage.j16.PENDING
            j16 r0 = defpackage.j16.CREATING
            boolean r4 = r4.a(r5, r0)
            if (r4 == 0) goto L38
            o27 r4 = defpackage.o27.a
            return r4
        L38:
            throw r1
        L39:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            return r1
        L3f:
            defpackage.me2.a0(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz4.n(k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(long r5, boolean r7, java.lang.String r8, java.lang.Long r9, defpackage.k11 r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof defpackage.bz4
            if (r0 == 0) goto L14
            r0 = r10
            bz4 r0 = (defpackage.bz4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            bz4 r0 = new bz4
            r0.<init>(r4, r10)
            goto L12
        L1a:
            java.lang.Object r0 = r10.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r10.Y
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            defpackage.me2.a0(r0)
            nc5 r0 = (defpackage.nc5) r0
            java.lang.Object r4 = r0.A
            return r4
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L34:
            defpackage.me2.a0(r0)
            java.lang.Object r4 = r4.A
            az4 r4 = (defpackage.az4) r4
            r10.Y = r3
            java.lang.Object r4 = r4.d(r5, r7, r8, r9, r10)
            if (r4 != r1) goto L44
            return r1
        L44:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz4.o(long, boolean, java.lang.String, java.lang.Long, k11):java.lang.Object");
    }

    public y45 p() {
        cg1 p;
        xf1 xf1Var = (xf1) this.A;
        hg1 hg1Var = (hg1) xf1Var.R;
        synchronized (hg1Var) {
            xf1Var.f(true);
            p = hg1Var.p(((ag1) xf1Var.L).a);
        }
        if (p != null) {
            return new y45(p);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [y83, o83] */
    public Object q(l73 l73Var, Type type) {
        qo2 qo2Var = ((dy6) this.A).c;
        qo2Var.getClass();
        n07 n07Var = new n07(type);
        ?? o83Var = new o83(y83.p0);
        o83Var.l0 = new Object[32];
        o83Var.m0 = 0;
        o83Var.n0 = new String[32];
        o83Var.o0 = new int[32];
        o83Var.E0(l73Var);
        return qo2Var.a(o83Var, n07Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(java.lang.String r5, defpackage.k11 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cz4
            if (r0 == 0) goto L13
            r0 = r6
            cz4 r0 = (defpackage.cz4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cz4 r0 = new cz4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            defpackage.me2.a0(r6)
            nc5 r6 = (defpackage.nc5) r6
            java.lang.Object r4 = r6.A
            return r4
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L32:
            defpackage.me2.a0(r6)
            java.lang.Object r4 = r4.A
            az4 r4 = (defpackage.az4) r4
            r0.Y = r3
            java.lang.Object r4 = r4.m(r5, r0)
            if (r4 != r1) goto L42
            return r1
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz4.r(java.lang.String, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Integer[] s() {
        /*
            r3 = this;
            java.lang.String r0 = "Failed to get output formats from StreamConfigurationMap"
            java.lang.String r1 = "StreamConfigurationMapCompatBaseImpl"
            r2 = 0
            java.lang.Object r3 = r3.A     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            android.hardware.camera2.params.StreamConfigurationMap r3 = (android.hardware.camera2.params.StreamConfigurationMap) r3     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            if (r3 == 0) goto L17
            int[] r3 = r3.getOutputFormats()     // Catch: java.lang.IllegalArgumentException -> L10 java.lang.NullPointerException -> L12
            goto L1d
        L10:
            r3 = move-exception
            goto L14
        L12:
            r3 = move-exception
            goto L19
        L14:
            defpackage.ve2.d0(r1, r0, r3)
        L17:
            r3 = r2
            goto L1d
        L19:
            defpackage.ve2.d0(r1, r0, r3)
            goto L17
        L1d:
            if (r3 == 0) goto L23
            java.lang.Integer[] r2 = defpackage.nu.I0(r3)
        L23:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz4.s():java.lang.Integer[]");
    }

    public long t(int i, Size size) {
        size.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.A;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    public Size[] u(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.A;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    public void v() {
        View view = (View) this.A;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public byte[] w() {
        try {
            String string = ((SharedPreferences) this.A).getString("__androidx_security_crypto_encrypted_file_keyset__", null);
            if (string != null) {
                return hk2.p(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value __androidx_security_crypto_encrypted_file_keyset__ does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException("can't read keyset; the pref value __androidx_security_crypto_encrypted_file_keyset__ is not a valid hex string");
        }
    }

    public void x() {
        if (((fw) this.A).b(j16.CREATED) != j16.CREATING) {
            return;
        }
        throw null;
    }

    public Object y(lj0 lj0Var, ki2 ki2Var) {
        e76 e76Var;
        zz5 zz5Var;
        int i;
        if (((ku0) this.A) == null) {
            or4.b("Called runAndWatch on a manager that has been disposed of");
        }
        ku0 ku0Var = (ku0) this.A;
        if ((ku0Var instanceof e76) && (zz5Var = (e76Var = (e76) ku0Var).f) != null && !zz5Var.equals(lj0Var)) {
            z04 z04Var = new z04();
            zz5 zz5Var2 = e76Var.f;
            if (zz5Var2 == null) {
                or4.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            e24 e24Var = e76Var.d;
            ArrayList arrayList = z04Var.c;
            if (e24Var == null) {
                Object obj = e76Var.b;
                obj.getClass();
                arrayList.add(new w04(zz5Var2, obj));
            } else {
                Object[] objArr = e24Var.b;
                long[] jArr = e24Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new w04(zz5Var2, objArr[(i2 << 3) + i5]));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            z04Var.d();
            e76Var.e();
            this.A = z04Var;
        }
        ku0 ku0Var2 = (ku0) this.A;
        ku0Var2.getClass();
        ga6 u = ma6.j().u(ku0Var2.j(lj0Var));
        ku0Var2.c(lj0Var);
        try {
            ga6 j2 = u.j();
            Object c = ki2Var.c();
            ga6.q(j2);
            u.c();
            ku0Var2.d();
            return c;
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }

    public void z(e33 e33Var) {
        ((Region) this.A).set(e33Var.a, e33Var.b, e33Var.c, e33Var.d);
    }

    @Override // defpackage.os1
    public void j() {
    }

    @Override // defpackage.os1
    public void g(ConsoleType consoleType) {
    }

    @Override // defpackage.oj2
    public void h(Throwable th) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ou, java.lang.Object] */
    public dz4(od1 od1Var) {
        float f = oc6.a;
        ?? obj = new Object();
        obj.a = f;
        float b = od1Var.b();
        float f2 = c92.a;
        obj.b = b * 386.0878f * 160.0f * 0.84f;
        this.A = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [lb6, java.lang.Object, dz4] */
    public dz4(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            ?? dz4Var = new dz4((Object) view);
            dz4Var.B = view;
            this.A = dz4Var;
            return;
        }
        this.A = new dz4((Object) view);
    }

    public dz4(Context context, int i) {
        switch (i) {
            case 10:
                this.A = context.getApplicationContext().getSharedPreferences("__androidx_security_crypto_encrypted_file_pref__", 0).edit();
                return;
            default:
                this.A = context.getApplicationContext().getSharedPreferences("__androidx_security_crypto_encrypted_file_pref__", 0);
                return;
        }
    }

    public /* synthetic */ dz4(Object obj) {
        this.A = obj;
    }
}
