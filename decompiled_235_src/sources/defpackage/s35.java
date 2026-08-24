package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Region;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s35  reason: default package */
/* loaded from: classes.dex */
public class s35 implements t35, bi4, ax1, w62, f36, ru6, so2, f3, ot {
    public Object A;

    public s35(int i) {
        switch (i) {
            case 7:
                this.A = np2.Y(Boolean.FALSE);
                return;
            case 8:
                this.A = new Region();
                return;
            case SubAllocator.N4 /* 26 */:
                this.A = new ex6(new kt5(this, 10));
                return;
            default:
                this.A = new AtomicBoolean(false);
                return;
        }
    }

    public static /* synthetic */ void s(s35 s35Var, t90 t90Var, int i) {
        s35Var.r(t90Var, i, q45.DEFAULT);
    }

    public byte[] A() {
        try {
            String string = ((SharedPreferences) this.A).getString("__androidx_security_crypto_encrypted_file_keyset__", null);
            if (string != null) {
                return np2.G(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value __androidx_security_crypto_encrypted_file_keyset__ does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException("can't read keyset; the pref value __androidx_security_crypto_encrypted_file_keyset__ is not a valid hex string");
        }
    }

    public void B() {
        if (((xw) this.A).b(xc6.CREATED) != xc6.CREATING) {
            return;
        }
        throw null;
    }

    public Object C(ul0 ul0Var, on2 on2Var) {
        si6 si6Var;
        ob6 ob6Var;
        int i;
        if (((gx0) this.A) == null) {
            r05.b("Called runAndWatch on a manager that has been disposed of");
        }
        gx0 gx0Var = (gx0) this.A;
        if ((gx0Var instanceof si6) && (ob6Var = (si6Var = (si6) gx0Var).f) != null && !ob6Var.equals(ul0Var)) {
            f94 f94Var = new f94();
            ob6 ob6Var2 = si6Var.f;
            if (ob6Var2 == null) {
                r05.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            ka4 ka4Var = si6Var.d;
            ArrayList arrayList = f94Var.c;
            if (ka4Var == null) {
                Object obj = si6Var.b;
                obj.getClass();
                arrayList.add(new c94(ob6Var2, obj));
            } else {
                Object[] objArr = ka4Var.b;
                long[] jArr = ka4Var.a;
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
                                    arrayList.add(new c94(ob6Var2, objArr[(i2 << 3) + i5]));
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
            f94Var.d();
            si6Var.e();
            this.A = f94Var;
        }
        gx0 gx0Var2 = (gx0) this.A;
        gx0Var2.getClass();
        vl6 u = bm6.j().u(gx0Var2.j(ul0Var));
        gx0Var2.c(ul0Var);
        try {
            vl6 j2 = u.j();
            Object c = on2Var.c();
            vl6.q(j2);
            u.c();
            gx0Var2.d();
            return c;
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }

    public void D(m93 m93Var) {
        ((Region) this.A).set(m93Var.a, m93Var.b, m93Var.c, m93Var.d);
    }

    public void E() {
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
                view.post(new ym6(view, 0));
            }
        }
    }

    public void F(byte[] bArr) {
        bArr.getClass();
        t90 t90Var = (t90) this.A;
        s(this, t90Var, bArr.length);
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        t90Var.b(length);
        fv.q0(t90Var.b, 0, length, bArr, t90Var.a);
        t90Var.b += length;
    }

    public void G(int i, int i2, q45 q45Var) {
        x45 x45Var;
        t90 t90Var = (t90) this.A;
        q45Var.getClass();
        if (q45Var == q45.FIXED) {
            x45Var = x45.i32;
        } else {
            x45Var = x45.VARINT;
        }
        s(this, t90Var, x45Var.wireIntWithTag(i2));
        r(t90Var, i, q45Var);
    }

    public void H(t90 t90Var) {
        t90Var.getClass();
        t90 t90Var2 = (t90) this.A;
        s(this, t90Var2, t90Var.b);
        int i = t90Var.b;
        t90Var2.b(i);
        fv.q0(t90Var2.b, 0, i, t90Var.a, t90Var2.a);
        t90Var2.b += i;
    }

    @Override // defpackage.w62
    public ke5 a() {
        h26 b;
        boolean z;
        IOException iOException = null;
        while (!((ue5) this.A).k.m0) {
            try {
                b = ((ue5) this.A).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    mb3.q(iOException, e);
                }
                if (!((ue5) this.A).a(null)) {
                    throw iOException;
                }
            }
            if (!b.c()) {
                g26 d = b.d();
                if (d.b == null && d.c == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    d = b.g();
                }
                h26 h26Var = d.b;
                Throwable th = d.c;
                if (th == null) {
                    if (h26Var != null) {
                        ((ue5) this.A).p.addFirst(h26Var);
                    }
                } else {
                    throw th;
                }
            }
            return b.b();
        }
        e41.i("Canceled");
        return null;
    }

    @Override // defpackage.w62
    public ue5 b() {
        return (ue5) this.A;
    }

    @Override // defpackage.f3
    public boolean c(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A;
        boolean z = false;
        if (!swipeDismissBehavior.v(view)) {
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
        WeakHashMap weakHashMap = ao7.a;
        view.offsetLeftAndRight(width);
        view.setAlpha(RecyclerView.B1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [wz5, android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.ax1
    public void e(pq5 pq5Var) {
        pq5Var.getClass();
        int i = EmulatorActivity.Z1;
        RomDetailsActivity romDetailsActivity = (RomDetailsActivity) this.A;
        Intent intent = new Intent(romDetailsActivity, EmulatorActivity.class);
        ?? obj = new Object();
        obj.A = pq5Var;
        intent.putExtra("rom", (Parcelable) obj);
        romDetailsActivity.startActivity(intent);
        romDetailsActivity.overridePendingTransition(17432576, 17432577);
    }

    @Override // defpackage.f36
    public e36 f(String str) {
        str.getClass();
        pu6 pu6Var = (pu6) this.A;
        String databaseName = pu6Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                i.f(lb1.A("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !qs6.O0('/', databaseName, databaseName).equals(qs6.O0('/', str, str))) {
            String databaseName2 = pu6Var.getDatabaseName();
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + databaseName2 + "' but '" + str + "' was requested.").toString());
        }
        return new mu6(pu6Var.I());
    }

    @Override // defpackage.ru6
    public String g() {
        return ((uu6) this.A).B;
    }

    @Override // defpackage.t35
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.t35
    public void j(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.A).setResultCode(i);
    }

    @Override // defpackage.ru6
    public void l(qu6 qu6Var) {
        uu6 uu6Var = (uu6) this.A;
        int length = uu6Var.R.length;
        for (int i = 1; i < length; i++) {
            int i2 = uu6Var.R[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                qu6Var.f(i);
                            }
                        } else {
                            byte[] bArr = uu6Var.d0[i];
                            bArr.getClass();
                            qu6Var.d(bArr, i);
                        }
                    } else {
                        String str = uu6Var.Z[i];
                        str.getClass();
                        qu6Var.m(i, str);
                    }
                } else {
                    qu6Var.p(i, uu6Var.Y[i]);
                }
            } else {
                qu6Var.c(i, uu6Var.X[i]);
            }
        }
    }

    @Override // defpackage.f36
    public boolean m() {
        return true;
    }

    @Override // defpackage.ot
    public Object n(p76 p76Var, Float f, Float f2, qn2 qn2Var, pl6 pl6Var) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object j = kn2.j(p76Var, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, ak7.f(RecyclerView.B1, floatValue2, 28), (io6) this.A, qn2Var, pl6Var);
        if (j == x61.COROUTINE_SUSPENDED) {
            return j;
        }
        return (qo) j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(s41 s41Var) {
        yc6 yc6Var;
        int i;
        if (s41Var instanceof yc6) {
            yc6Var = (yc6) s41Var;
            int i2 = yc6Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yc6Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = yc6Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = yc6Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        if (((xw) this.A).a(xc6.PENDING, xc6.CREATING)) {
                            return jg7.a;
                        }
                        throw null;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                throw null;
            }
        }
        yc6Var = new yc6(this, s41Var);
        Object obj2 = yc6Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = yc6Var.Y;
        if (i == 0) {
        }
    }

    @Override // defpackage.bi4
    public void onError(Throwable th) {
        kj2.w("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Void r1 = (Void) obj;
        ((kv6) this.A).run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(long j, boolean z, String str, Long l, s41 s41Var) {
        m85 m85Var;
        int i;
        if (s41Var instanceof m85) {
            m85Var = (m85) s41Var;
            int i2 = m85Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m85Var.Y = i2 - Integer.MIN_VALUE;
                m85 m85Var2 = m85Var;
                Object obj = m85Var2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = m85Var2.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                m85Var2.Y = 1;
                Object d = ((l85) this.A).d(j, z, str, l, m85Var2);
                if (d == x61Var) {
                    return x61Var;
                }
                return d;
            }
        }
        m85Var = new m85(this, s41Var);
        m85 m85Var22 = m85Var;
        Object obj2 = m85Var22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = m85Var22.Y;
        if (i == 0) {
        }
    }

    public le5 q() {
        gk1 k;
        bk1 bk1Var = (bk1) this.A;
        lk1 lk1Var = (lk1) bk1Var.R;
        synchronized (lk1Var) {
            bk1Var.e(true);
            k = lk1Var.k(((ek1) bk1Var.L).a);
        }
        if (k != null) {
            return new le5(k);
        }
        return null;
    }

    public void r(t90 t90Var, int i, q45 q45Var) {
        int i2 = i55.a[q45Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    int i3 = (i << 1) ^ (i >> 31);
                    t90Var.b(5);
                    if ((i3 & (-128)) == 0) {
                        byte[] bArr = t90Var.a;
                        int i4 = t90Var.b;
                        t90Var.b = i4 + 1;
                        bArr[i4] = (byte) i3;
                        return;
                    }
                    long j = i3;
                    t90Var.a(t90.c[Long.numberOfLeadingZeros(j)], j);
                    return;
                }
                i.d();
                return;
            }
            long j2 = i;
            t90Var.getClass();
            int i5 = t90.c[Long.numberOfLeadingZeros(j2)];
            t90Var.b(i5 + 1);
            t90Var.a(i5, j2);
            return;
        }
        ((t90) this.A).c(Integer.reverseBytes(i));
    }

    public void t(t90 t90Var, long j, q45 q45Var) {
        int i = i55.a[q45Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    long j2 = (j >> 63) ^ (j << 1);
                    int i2 = t90.c[Long.numberOfLeadingZeros(j2)];
                    t90Var.b(i2 + 1);
                    t90Var.a(i2, j2);
                    return;
                }
                i.d();
                return;
            }
            int i3 = t90.c[Long.numberOfLeadingZeros(j)];
            t90Var.b(i3 + 1);
            t90Var.a(i3, j);
            return;
        }
        ((t90) this.A).d(Long.reverseBytes(j));
    }

    @Override // defpackage.bi4
    public void u(Object obj) {
        ((b31) this.A).accept(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(String str, s41 s41Var) {
        n85 n85Var;
        int i;
        if (s41Var instanceof n85) {
            n85Var = (n85) s41Var;
            int i2 = n85Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n85Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = n85Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = n85Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                n85Var.Y = 1;
                Object m = ((l85) this.A).m(str, n85Var);
                if (m == x61Var) {
                    return x61Var;
                }
                return m;
            }
        }
        n85Var = new n85(this, s41Var);
        Object obj2 = n85Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = n85Var.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer[] w() {
        int[] iArr;
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) this.A;
        } catch (IllegalArgumentException e) {
            kj2.g0("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e);
        } catch (NullPointerException e2) {
            kj2.g0("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e2);
        }
        if (streamConfigurationMap != null) {
            iArr = streamConfigurationMap.getOutputFormats();
            if (iArr != null) {
                return null;
            }
            return fv.W0(iArr);
        }
        iArr = null;
        if (iArr != null) {
        }
    }

    public long x(int i, Size size) {
        size.getClass();
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.A;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputMinFrameDuration(i, size);
        }
        return 0L;
    }

    public Size[] y(int i) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.A;
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(i);
        }
        return null;
    }

    public void z() {
        View view = (View) this.A;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.ax1
    public void d() {
    }

    @Override // defpackage.so2
    public void i(Throwable th) {
    }

    @Override // defpackage.ax1
    public void k(ConsoleType consoleType) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, gv] */
    public s35(qh1 qh1Var) {
        float f = eo6.a;
        ?? obj = new Object();
        obj.a = f;
        float a = qh1Var.a();
        float f2 = ud2.a;
        obj.b = a * 386.0878f * 160.0f * 0.84f;
        this.A = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [s35, java.lang.Object, bn6] */
    public s35(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            ?? s35Var = new s35((Object) view);
            s35Var.B = view;
            this.A = s35Var;
            return;
        }
        this.A = new s35((Object) view);
    }

    public s35(Context context, int i) {
        switch (i) {
            case 13:
                this.A = context.getApplicationContext().getSharedPreferences("__androidx_security_crypto_encrypted_file_pref__", 0).edit();
                return;
            default:
                this.A = context.getApplicationContext().getSharedPreferences("__androidx_security_crypto_encrypted_file_pref__", 0);
                return;
        }
    }

    public /* synthetic */ s35(Object obj) {
        this.A = obj;
    }
}
