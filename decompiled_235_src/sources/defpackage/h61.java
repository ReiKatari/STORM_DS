package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class h61 implements rb0, hu, ph4, zk4, aw, mo2, u23, y05, ou6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ h61(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.zk4
    public vu7 U(View view, vu7 vu7Var) {
        int i = this.A;
        d83 d83Var = d83.e;
        Object obj = this.B;
        switch (i) {
            case 7:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj;
                int i2 = EmulatorActivity.Z1;
                view.getClass();
                e83 h = vu7Var.a.h(128);
                h.getClass();
                int i3 = h.d;
                int i4 = h.c;
                int i5 = h.a;
                s8 s8Var = emulatorActivity.B0;
                if (s8Var != null) {
                    s8Var.f.setPadding(i5, 0, i4, i3);
                    if (!((ng6) emulatorActivity.W().c).b.getBoolean("system_ignore_display_cutout_in_layouts", false)) {
                        d83Var = new d83(i5, h.b, i4, i3);
                    }
                    sz1 W = emulatorActivity.W();
                    W.getClass();
                    W.u.o(d83Var);
                    return vu7.b;
                }
                nb3.a0("binding");
                throw null;
            case 8:
            case 9:
            default:
                hx6 hx6Var = (hx6) obj;
                ArrayList arrayList = hx6Var.b;
                ru7 ru7Var = vu7Var.a;
                e83 b = e83.b(ru7Var.h(519), ru7Var.h(64));
                e83 b2 = e83.b(ru7Var.i(519), ru7Var.i(64));
                if (!b.equals(hx6Var.c) || !b2.equals(hx6Var.d)) {
                    hx6Var.c = b;
                    hx6Var.d = b2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        l45 l45Var = (l45) arrayList.get(size);
                        l45Var.c = b;
                        l45Var.d = b2;
                        l45Var.c();
                    }
                }
                return vu7Var;
            case 10:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) obj;
                int i6 = LayoutEditorActivity.N0;
                view.getClass();
                e83 h2 = vu7Var.a.h(128);
                h2.getClass();
                if (!((ng6) layoutEditorActivity.C().e).b.getBoolean("system_ignore_display_cutout_in_layouts", false)) {
                    d83Var = new d83(h2.a, h2.b, h2.c, h2.d);
                }
                layoutEditorActivity.D();
                layoutEditorActivity.C().d.o(d83Var);
                return vu7Var;
            case 11:
                view.getClass();
                ru7 ru7Var2 = vu7Var.a;
                e83 h3 = ru7Var2.h(128);
                h3.getClass();
                e83 h4 = ru7Var2.h(519);
                h4.getClass();
                int max = Math.max(h3.b, h4.b);
                int max2 = Math.max(h3.d, h4.d);
                int max3 = Math.max(h3.a, h4.a);
                int max4 = Math.max(h3.c, h4.c);
                nb1 nb1Var = ((b) obj).L;
                ((ScrollView) nb1Var.k).setPadding(max3, 0, max4, max2);
                ((LinearLayout) nb1Var.i).setPadding(max3, max, max4, 0);
                ((LayoutEditorView) nb1Var.A).setSafeAreaInsets(new Rect(max3, max, max4, max2));
                return vu7.b;
        }
    }

    @Override // defpackage.hu
    public int a(int i, kk3 kk3Var) {
        return ((c40) this.B).a(0, i, kk3Var);
    }

    @Override // defpackage.aw, defpackage.mo2
    public gx3 apply(Object obj) {
        return (gx3) ((bg2) this.B).g(obj);
    }

    @Override // defpackage.u23
    public void b(v23 v23Var) {
        je0 je0Var;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 15:
                o54 o54Var = (o54) obj;
                synchronized (o54Var.A) {
                    o54Var.L++;
                }
                o54Var.i(v23Var);
                return;
            default:
                ty7 ty7Var = (ty7) obj;
                v23Var.getClass();
                try {
                    s23 a = v23Var.a();
                    if (a != null) {
                        m44 m44Var = ty7Var.c;
                        m44Var.getClass();
                        i23 S = a.S();
                        Object obj2 = null;
                        if (S instanceof ke0) {
                            je0Var = ((ke0) S).a;
                        } else {
                            je0Var = null;
                        }
                        if (je0Var != null && ((je0Var.g() == ge0.LOCKED_FOCUSED || je0Var.g() == ge0.PASSIVE_FOCUSED) && je0Var.f() == fe0.CONVERGED && je0Var.d() == he0.CONVERGED)) {
                            synchronized (m44Var.L) {
                                if (((ArrayDeque) m44Var.B).size() >= 3) {
                                    obj2 = m44Var.e();
                                }
                                ((ArrayDeque) m44Var.B).addFirst(a);
                            }
                            if (((fa6) m44Var.R) != null && obj2 != null) {
                                ((s23) obj2).close();
                                return;
                            }
                            return;
                        }
                        ((fa6) m44Var.R).getClass();
                        a.close();
                        return;
                    }
                    return;
                } catch (IllegalStateException unused) {
                    if (kj2.G()) {
                        Log.e("CXCP", "Failed to acquire latest image");
                        return;
                    }
                    return;
                }
        }
    }

    public void c(ed6 ed6Var) {
        vr4 vr4Var;
        float f;
        byte b;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 8:
                ((h61) obj).c(ed6Var);
                return;
            default:
                nw4 nw4Var = (nw4) obj;
                s23 s23Var = ed6Var.B;
                ByteBuffer a = s23Var.j()[0].a();
                a.getClass();
                r23 r23Var = s23Var.j()[1];
                r23 r23Var2 = s23Var.j()[2];
                a.rewind();
                r23Var.a().rewind();
                r23Var2.a().rewind();
                int i2 = ed6Var.Y;
                int i3 = ed6Var.Z;
                i23 i23Var = ed6Var.X;
                i23Var.getClass();
                zb zbVar = nw4Var.f;
                float[] fArr = nw4Var.j;
                if (i2 != 0) {
                    if (i3 != 0) {
                        if (a.remaining() != 0) {
                            if (r23Var.a().remaining() != 0) {
                                if (r23Var.m() != 0) {
                                    if (r23Var.C() != 0) {
                                        if (r23Var2.a().remaining() != 0) {
                                            if (r23Var2.m() != 0) {
                                                if (r23Var2.C() != 0) {
                                                    if (i23Var.d() != 90 && i23Var.d() != 270) {
                                                        vr4Var = new vr4(Integer.valueOf(i2), Integer.valueOf(i3));
                                                    } else {
                                                        vr4Var = new vr4(Integer.valueOf(i3), Integer.valueOf(i2));
                                                    }
                                                    float intValue = ((Number) vr4Var.A).intValue();
                                                    float intValue2 = ((Number) vr4Var.B).intValue();
                                                    if (intValue / intValue2 > 1.3333334f) {
                                                        f = intValue2 / 480.0f;
                                                    } else {
                                                        f = intValue / 640.0f;
                                                    }
                                                    Matrix matrix = new Matrix();
                                                    matrix.setTranslate(-319.5f, -239.5f);
                                                    matrix.postRotate(-i23Var.d());
                                                    matrix.postScale(f, f);
                                                    Matrix matrix2 = new Matrix();
                                                    if (i23Var.d() != 90 && i23Var.d() != 270) {
                                                        matrix2.setTranslate((intValue / 640.0f) * 319.5f, (intValue2 / 480.0f) * 239.5f);
                                                    } else {
                                                        matrix2.setTranslate((intValue2 / 480.0f) * 239.5f, (intValue / 640.0f) * 319.5f);
                                                    }
                                                    matrix.mapPoints(fArr, nw4Var.i);
                                                    matrix2.mapPoints(fArr);
                                                    int m = i2 / r23Var.m();
                                                    int remaining = i3 / (r23Var.a().remaining() / r23Var.m());
                                                    int m2 = i2 / r23Var2.m();
                                                    int remaining2 = i3 / (r23Var2.a().remaining() / r23Var2.m());
                                                    byte[][] bArr = (byte[][]) zbVar.L;
                                                    byte[] bArr2 = bArr[(zbVar.B + 1) % bArr.length];
                                                    for (int i4 = 0; i4 < 480; i4++) {
                                                        int i5 = 0;
                                                        while (i5 < 640) {
                                                            int i6 = ((i4 * 640) + i5) * 2;
                                                            int i7 = (int) fArr[i6];
                                                            int i8 = i6 + 1;
                                                            int i9 = m;
                                                            int i10 = (int) fArr[i8];
                                                            bArr2[i6] = a.get((i10 * i2) + i7);
                                                            if (i5 % 2 == 0) {
                                                                b = r23Var.a().get((r23Var.C() * ((i7 / i9) / r23Var.C())) + (((i10 / remaining) * i2) / i9));
                                                            } else {
                                                                b = r23Var2.a().get((r23Var2.C() * ((i7 / m2) / r23Var2.C())) + (((i10 / remaining2) * i2) / m2));
                                                            }
                                                            bArr2[i8] = b;
                                                            i5++;
                                                            m = i9;
                                                        }
                                                    }
                                                    zbVar.B = (zbVar.B + 1) % ((byte[][]) zbVar.L).length;
                                                    ed6Var.close();
                                                    return;
                                                }
                                                throw new Exception("V plane pixel stride is 0");
                                            }
                                            throw new Exception("V plane row stride is 0");
                                        }
                                        throw new Exception("V buffer is empty");
                                    }
                                    throw new Exception("U plane pixel stride is 0");
                                }
                                throw new Exception("U plane row stride is 0");
                            }
                            throw new Exception("U buffer is empty");
                        }
                        throw new Exception("Y buffer is empty");
                    }
                    throw new Exception("Image height is 0");
                }
                throw new Exception("Image width is 0");
        }
    }

    public void d() {
        eo2 eo2Var = (eo2) this.B;
        synchronized (bm6.c) {
            bm6.h = gt0.T0(bm6.h, eo2Var);
        }
    }

    @Override // defpackage.ph4
    public Object e() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 5:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    uj2 uj2Var = oh5.a;
                    u34.p("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    String b = oh5.b(constructor);
                    throw new RuntimeException("Failed to invoke constructor '" + b + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    u34.p("Failed to invoke constructor '" + oh5.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return ah7.a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // defpackage.ou6
    public pu6 f(nu6 nu6Var) {
        Context context = (Context) this.B;
        String str = nu6Var.b;
        zb zbVar = nu6Var.c;
        zbVar.getClass();
        if (str != null && str.length() != 0) {
            return new bn2(context, str, zbVar, true, true);
        }
        i.h("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    public boolean g(s63 s63Var, int i, Bundle bundle) {
        q31 q31Var;
        kr krVar = (kr) this.B;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((r63) s63Var.B).g();
                Parcelable parcelable = (Parcelable) ((r63) s63Var.B).r();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        r63 r63Var = (r63) s63Var.B;
        ClipData clipData = new ClipData(r63Var.m(), new ClipData.Item(r63Var.c()));
        if (i2 >= 31) {
            q31Var = new os0(clipData, 2);
        } else {
            r31 r31Var = new r31();
            r31Var.B = clipData;
            r31Var.L = 2;
            q31Var = r31Var;
        }
        q31Var.s(r63Var.h());
        q31Var.setExtras(bundle);
        if (ao7.j(krVar, q31Var.build()) != null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.y05
    public void i(Preference preference) {
        boolean z;
        int i;
        int i2 = this.A;
        final boolean z2 = false;
        Object obj = this.B;
        switch (i2) {
            case 18:
                final RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = (RetroAchievementsPreferencesFragment) obj;
                qm5 qm5Var = (qm5) ((rp6) retroAchievementsPreferencesFragment.k().d.getValue()).getValue();
                boolean booleanExtra = retroAchievementsPreferencesFragment.requireActivity().getIntent().getBooleanExtra("ra_runtime_identity_locked", false);
                if (qm5Var instanceof nm5) {
                    if (retroAchievementsPreferencesFragment.requireActivity().getIntent().getBooleanExtra("in_game", false) && retroAchievementsPreferencesFragment.requireActivity().getIntent().getBooleanExtra("ra_runtime_identity_locked", false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && retroAchievementsPreferencesFragment.requireActivity().getIntent().getBooleanExtra("ra_in_game_logout_supported", false)) {
                        z2 = true;
                    }
                    if (z && !z2) {
                        retroAchievementsPreferencesFragment.l();
                        return;
                    }
                    zb zbVar = new zb(retroAchievementsPreferencesFragment.requireContext());
                    zbVar.z(R.string.retroachievements_logout);
                    if (z2) {
                        i = R.string.retroachievements_logout_confirmation_in_game;
                    } else {
                        i = R.string.retroachievements_logout_confirmation;
                    }
                    zbVar.w(i);
                    zbVar.y(R.string.retroachievements_logout, new DialogInterface.OnClickListener() { // from class: mn5
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            boolean z3 = z2;
                            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment2 = retroAchievementsPreferencesFragment;
                            if (z3) {
                                retroAchievementsPreferencesFragment2.requireActivity().setResult(-1, new Intent().putExtra("ra_logout_requested", true));
                                retroAchievementsPreferencesFragment2.requireActivity().finish();
                            } else {
                                sn5 k = retroAchievementsPreferencesFragment2.k();
                                hv.L(to7.a(k), null, null, new qn5(k, null, 1), 3);
                            }
                            dialogInterface.dismiss();
                        }
                    });
                    zbVar.x(R.string.cancel, new qo0(6));
                    zbVar.B();
                    return;
                } else if (qm5Var instanceof pm5) {
                    if (booleanExtra) {
                        retroAchievementsPreferencesFragment.l();
                        return;
                    } else {
                        retroAchievementsPreferencesFragment.m(((pm5) qm5Var).a);
                        return;
                    }
                } else if (nb3.k(qm5Var, om5.a)) {
                    if (booleanExtra) {
                        retroAchievementsPreferencesFragment.l();
                        return;
                    } else {
                        retroAchievementsPreferencesFragment.m(null);
                        return;
                    }
                } else if (!nb3.k(qm5Var, om5.b)) {
                    i.d();
                    return;
                } else {
                    return;
                }
            default:
                RomsPreferencesFragment romsPreferencesFragment = (RomsPreferencesFragment) obj;
                ud4 ud4Var = ((yz5) romsPreferencesFragment.Z.getValue()).b;
                File externalCacheDir = ud4Var.a.getExternalCacheDir();
                if (externalCacheDir != null) {
                    z2 = jc2.x0(new File(externalCacheDir, "extracted_roms"));
                    ud4Var.c.c(jg7.a);
                }
                if (!z2) {
                    Toast.makeText(romsPreferencesFragment.requireContext(), (int) R.string.error_clear_rom_cache, 1).show();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.rb0
    public Object s(qb0 qb0Var) {
        gx3 gx3Var;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((ed3) obj).a0(new k0(qb0Var, 17));
                return "Job.asListenableFuture";
            case 3:
                kh0 kh0Var = (kh0) obj;
                synchronized (kh0Var.a) {
                    kh0Var.e = qb0Var;
                }
                return "CameraRepository-deinit";
            default:
                gj0 gj0Var = (gj0) obj;
                gj0Var.n.f();
                if (gj0Var.o.a()) {
                    t16 t16Var = (t16) gj0Var.o.getValue();
                    synchronized (t16Var.a) {
                        t16Var.b.disable();
                        t16Var.c.clear();
                        t16Var.d = -1;
                    }
                }
                kh0 kh0Var2 = gj0Var.a;
                synchronized (kh0Var2.a) {
                    try {
                        boolean isEmpty = kh0Var2.b.isEmpty();
                        gx3Var = kh0Var2.d;
                        if (isEmpty) {
                            if (gx3Var == null) {
                                gx3Var = n33.L;
                            }
                        } else {
                            if (gx3Var == null) {
                                gx3Var = ak7.W(new h61(kh0Var2, 3));
                                kh0Var2.d = gx3Var;
                            }
                            kh0Var2.c.addAll(kh0Var2.b.values());
                            for (eg0 eg0Var : kh0Var2.b.values()) {
                                eg0Var.release().a(u24.j(), new mf(7, kh0Var2, eg0Var));
                            }
                            kh0Var2.b.clear();
                        }
                    } finally {
                    }
                }
                gx3Var.a(gj0Var.d, new mf(9, gj0Var, qb0Var));
                return "CameraX shutdownInternal";
        }
    }

    @Override // defpackage.mo2
    public Object apply(Object obj) {
        return (Void) ((t00) this.B).g(obj);
    }
}
