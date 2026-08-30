package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.settings.fragments.CheatsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RetroAchievementsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a31  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a31 implements j90, pt, vr4, y84, bc4, iv, ij2, qw2, ui6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ a31(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // defpackage.bc4
    public vf7 G(View view, vf7 vf7Var) {
        int i = this.A;
        w13 w13Var = w13.e;
        Object obj = this.B;
        switch (i) {
            case 8:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj;
                int i2 = EmulatorActivity.P1;
                view.getClass();
                x13 h = vf7Var.a.h(128);
                h.getClass();
                int i3 = h.b;
                int i4 = h.d;
                int i5 = h.c;
                int i6 = h.a;
                r8 r8Var = emulatorActivity.A0;
                if (r8Var != null) {
                    ((RecyclerView) r8Var.e).setPadding(i6, 0, i5, i4);
                    r8 r8Var2 = emulatorActivity.A0;
                    if (r8Var2 != null) {
                        TextView textView = (TextView) r8Var2.h;
                        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                        if (layoutParams != null) {
                            jy0 jy0Var = (jy0) layoutParams;
                            jy0Var.setMargins(i6, i3, i5, i4);
                            textView.setLayoutParams(jy0Var);
                            if (!((b56) emulatorActivity.U().c).b.getBoolean("system_ignore_display_cutout_in_layouts", false)) {
                                w13Var = new w13(i6, i3, i5, i4);
                            }
                            hv1 U = emulatorActivity.U();
                            U.getClass();
                            ee6 ee6Var = (ee6) U.u.L;
                            ee6Var.getClass();
                            ee6Var.l(null, w13Var);
                            return vf7.b;
                        }
                        c44.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        return null;
                    }
                    b53.g0("binding");
                    throw null;
                }
                b53.g0("binding");
                throw null;
            case 9:
            case 10:
            default:
                ll6 ll6Var = (ll6) obj;
                ArrayList arrayList = ll6Var.b;
                rf7 rf7Var = vf7Var.a;
                x13 b = x13.b(rf7Var.h(519), rf7Var.h(64));
                x13 b2 = x13.b(rf7Var.i(519), rf7Var.i(64));
                if (!b.equals(ll6Var.c) || !b2.equals(ll6Var.d)) {
                    ll6Var.c = b;
                    ll6Var.d = b2;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ev4 ev4Var = (ev4) arrayList.get(size);
                        ev4Var.c = b;
                        ev4Var.d = b2;
                        ev4Var.c();
                    }
                }
                return vf7Var;
            case 11:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) obj;
                int i7 = LayoutEditorActivity.M0;
                view.getClass();
                x13 h2 = vf7Var.a.h(128);
                h2.getClass();
                if (!((b56) layoutEditorActivity.B().e).b.getBoolean("system_ignore_display_cutout_in_layouts", false)) {
                    w13Var = new w13(h2.a, h2.b, h2.c, h2.d);
                }
                layoutEditorActivity.C();
                ee6 ee6Var2 = (ee6) layoutEditorActivity.B().d.L;
                ee6Var2.getClass();
                ee6Var2.l(null, w13Var);
                return vf7Var;
            case mj2.L /* 12 */:
                view.getClass();
                x13 h3 = vf7Var.a.h(128);
                h3.getClass();
                qa7 qa7Var = ((b) obj).L;
                ScrollView scrollView = qa7Var.k;
                int i8 = h3.a;
                int i9 = h3.c;
                int i10 = h3.d;
                scrollView.setPadding(i8, 0, i9, i10);
                qa7Var.i.setPadding(i8, 0, i9, i10);
                return vf7.b;
        }
    }

    @Override // defpackage.ui6
    public vi6 a(ti6 ti6Var) {
        Context context = (Context) this.B;
        String str = ti6Var.b;
        sb sbVar = ti6Var.c;
        sbVar.getClass();
        if (str != null && str.length() != 0) {
            return new bi2(context, str, sbVar, true, true);
        }
        i.i("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    @Override // defpackage.iv, defpackage.ij2
    public fq3 apply(Object obj) {
        return (fq3) ((kb2) this.B).n(obj);
    }

    @Override // defpackage.qw2
    public void b(rw2 rw2Var) {
        ac0 ac0Var;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 16:
                vx3 vx3Var = (vx3) obj;
                synchronized (vx3Var.A) {
                    vx3Var.L++;
                }
                vx3Var.j(rw2Var);
                return;
            default:
                bk7 bk7Var = (bk7) obj;
                rw2Var.getClass();
                try {
                    ow2 b = rw2Var.b();
                    if (b != null) {
                        n85 n85Var = bk7Var.c;
                        n85Var.getClass();
                        ew2 s = b.s();
                        Object obj2 = null;
                        if (s instanceof bc0) {
                            ac0Var = ((bc0) s).a;
                        } else {
                            ac0Var = null;
                        }
                        if (ac0Var != null && ((ac0Var.g() == xb0.LOCKED_FOCUSED || ac0Var.g() == xb0.PASSIVE_FOCUSED) && ac0Var.e() == wb0.CONVERGED && ac0Var.f() == yb0.CONVERGED)) {
                            synchronized (n85Var.L) {
                                if (((ArrayDeque) n85Var.B).size() >= 3) {
                                    obj2 = n85Var.c();
                                }
                                ((ArrayDeque) n85Var.B).addFirst(b);
                            }
                            if (((vd6) n85Var.R) != null && obj2 != null) {
                                ((ow2) obj2).close();
                                return;
                            }
                            return;
                        }
                        ((vd6) n85Var.R).getClass();
                        b.close();
                        return;
                    }
                    return;
                } catch (IllegalStateException unused) {
                    if (ve2.E()) {
                        Log.e("CXCP", "Failed to acquire latest image");
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.vr4
    public void c(Preference preference) {
        boolean z;
        int i;
        int i2 = this.A;
        final boolean z2 = false;
        Object obj = this.B;
        switch (i2) {
            case 5:
                CheatsPreferencesFragment cheatsPreferencesFragment = (CheatsPreferencesFragment) obj;
                if (Build.VERSION.SDK_INT >= 33) {
                    Context requireContext = cheatsPreferencesFragment.requireContext();
                    requireContext.getClass();
                    if (jv3.o(requireContext, "android.permission.POST_NOTIFICATIONS") != 0) {
                        cheatsPreferencesFragment.d0.a("android.permission.POST_NOTIFICATIONS");
                        return;
                    }
                }
                cheatsPreferencesFragment.k();
                return;
            case 19:
                final RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment = (RetroAchievementsPreferencesFragment) obj;
                wc5 wc5Var = (wc5) ((ce6) retroAchievementsPreferencesFragment.k().d.getValue()).getValue();
                boolean booleanExtra = retroAchievementsPreferencesFragment.requireActivity().getIntent().getBooleanExtra("ra_runtime_identity_locked", false);
                if (wc5Var instanceof tc5) {
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
                    sb sbVar = new sb(retroAchievementsPreferencesFragment.requireContext());
                    sbVar.A(R.string.retroachievements_logout);
                    if (z2) {
                        i = R.string.retroachievements_logout_confirmation_in_game;
                    } else {
                        i = R.string.retroachievements_logout_confirmation;
                    }
                    sbVar.w(i);
                    sbVar.z(R.string.retroachievements_logout, new DialogInterface.OnClickListener() { // from class: rd5
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            boolean z3 = z2;
                            RetroAchievementsPreferencesFragment retroAchievementsPreferencesFragment2 = retroAchievementsPreferencesFragment;
                            if (z3) {
                                retroAchievementsPreferencesFragment2.requireActivity().setResult(-1, new Intent().putExtra("ra_logout_requested", true));
                                retroAchievementsPreferencesFragment2.requireActivity().finish();
                            } else {
                                xd5 k = retroAchievementsPreferencesFragment2.k();
                                tq5.w(ua7.a(k), null, null, new vd5(k, null, 1), 3);
                            }
                            dialogInterface.dismiss();
                        }
                    });
                    sbVar.x(R.string.cancel, new hm0(7));
                    sbVar.C();
                    return;
                } else if (wc5Var instanceof vc5) {
                    if (booleanExtra) {
                        retroAchievementsPreferencesFragment.l();
                        return;
                    } else {
                        retroAchievementsPreferencesFragment.m(((vc5) wc5Var).a);
                        return;
                    }
                } else if (b53.x(wc5Var, uc5.a)) {
                    if (booleanExtra) {
                        retroAchievementsPreferencesFragment.l();
                        return;
                    } else {
                        retroAchievementsPreferencesFragment.m(null);
                        return;
                    }
                } else if (!b53.x(wc5Var, uc5.b)) {
                    i.c();
                    return;
                } else {
                    return;
                }
            default:
                RomsPreferencesFragment romsPreferencesFragment = (RomsPreferencesFragment) obj;
                o54 o54Var = ((dp5) romsPreferencesFragment.Z.getValue()).b;
                File externalCacheDir = o54Var.a.getExternalCacheDir();
                if (externalCacheDir != null) {
                    z2 = q72.H(new File(externalCacheDir, "extracted_roms"));
                    o54Var.c.c(o27.a);
                }
                if (!z2) {
                    Toast.makeText(romsPreferencesFragment.requireContext(), (int) R.string.error_clear_rom_cache, 1).show();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.y84
    public Object d() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case ig7.b /* 6 */:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    hi2 hi2Var = y75.a;
                    c44.o("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                    return null;
                } catch (InstantiationException e2) {
                    String b = y75.b(constructor);
                    throw new RuntimeException("Failed to invoke constructor '" + b + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    c44.o("Failed to invoke constructor '" + y75.b(constructor) + "' with no args", e3.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return f37.a.a(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // defpackage.pt
    public int e(int i, sd3 sd3Var) {
        return ((h20) this.B).a(0, i, sd3Var);
    }

    public void f(q16 q16Var) {
        ti4 ti4Var;
        float f;
        byte b;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 9:
                ((a31) obj).f(q16Var);
                return;
            default:
                in4 in4Var = (in4) obj;
                ow2 ow2Var = q16Var.B;
                ByteBuffer b2 = ow2Var.m()[0].b();
                b2.getClass();
                nw2 nw2Var = ow2Var.m()[1];
                nw2 nw2Var2 = ow2Var.m()[2];
                b2.rewind();
                nw2Var.b().rewind();
                nw2Var2.b().rewind();
                int i2 = q16Var.Y;
                int i3 = q16Var.Z;
                ew2 ew2Var = q16Var.X;
                ew2Var.getClass();
                sb sbVar = in4Var.f;
                float[] fArr = in4Var.j;
                if (i2 != 0) {
                    if (i3 != 0) {
                        if (b2.remaining() != 0) {
                            if (nw2Var.b().remaining() != 0) {
                                if (nw2Var.r() != 0) {
                                    if (nw2Var.u() != 0) {
                                        if (nw2Var2.b().remaining() != 0) {
                                            if (nw2Var2.r() != 0) {
                                                if (nw2Var2.u() != 0) {
                                                    if (ew2Var.d() != 90 && ew2Var.d() != 270) {
                                                        ti4Var = new ti4(Integer.valueOf(i2), Integer.valueOf(i3));
                                                    } else {
                                                        ti4Var = new ti4(Integer.valueOf(i3), Integer.valueOf(i2));
                                                    }
                                                    float intValue = ((Number) ti4Var.A).intValue();
                                                    float intValue2 = ((Number) ti4Var.B).intValue();
                                                    if (intValue / intValue2 > 1.3333334f) {
                                                        f = intValue2 / 480.0f;
                                                    } else {
                                                        f = intValue / 640.0f;
                                                    }
                                                    Matrix matrix = new Matrix();
                                                    matrix.setTranslate(-319.5f, -239.5f);
                                                    matrix.postRotate(-ew2Var.d());
                                                    matrix.postScale(f, f);
                                                    Matrix matrix2 = new Matrix();
                                                    if (ew2Var.d() != 90 && ew2Var.d() != 270) {
                                                        matrix2.setTranslate((intValue / 640.0f) * 319.5f, (intValue2 / 480.0f) * 239.5f);
                                                    } else {
                                                        matrix2.setTranslate((intValue2 / 480.0f) * 239.5f, (intValue / 640.0f) * 319.5f);
                                                    }
                                                    matrix.mapPoints(fArr, in4Var.i);
                                                    matrix2.mapPoints(fArr);
                                                    int r = i2 / nw2Var.r();
                                                    int remaining = i3 / (nw2Var.b().remaining() / nw2Var.r());
                                                    int r2 = i2 / nw2Var2.r();
                                                    int remaining2 = i3 / (nw2Var2.b().remaining() / nw2Var2.r());
                                                    byte[][] bArr = (byte[][]) sbVar.L;
                                                    byte[] bArr2 = bArr[(sbVar.B + 1) % bArr.length];
                                                    for (int i4 = 0; i4 < 480; i4++) {
                                                        int i5 = 0;
                                                        while (i5 < 640) {
                                                            int i6 = ((i4 * 640) + i5) * 2;
                                                            int i7 = (int) fArr[i6];
                                                            int i8 = i6 + 1;
                                                            int i9 = r;
                                                            int i10 = (int) fArr[i8];
                                                            bArr2[i6] = b2.get((i10 * i2) + i7);
                                                            if (i5 % 2 == 0) {
                                                                b = nw2Var.b().get((nw2Var.u() * ((i7 / i9) / nw2Var.u())) + (((i10 / remaining) * i2) / i9));
                                                            } else {
                                                                b = nw2Var2.b().get((nw2Var2.u() * ((i7 / r2) / nw2Var2.u())) + (((i10 / remaining2) * i2) / r2));
                                                            }
                                                            bArr2[i8] = b;
                                                            i5++;
                                                            r = i9;
                                                        }
                                                    }
                                                    sbVar.B = (sbVar.B + 1) % ((byte[][]) sbVar.L).length;
                                                    q16Var.close();
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

    public void g() {
        aj2 aj2Var = (aj2) this.B;
        synchronized (ma6.c) {
            ma6.h = tq0.W0(ma6.h, aj2Var);
        }
    }

    public boolean h(t71 t71Var, int i, Bundle bundle) {
        l01 l01Var;
        xq xqVar = (xq) this.B;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((o03) t71Var.B).e();
                Parcelable parcelable = (Parcelable) ((o03) t71Var.B).b();
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
        o03 o03Var = (o03) t71Var.B;
        ClipData clipData = new ClipData(o03Var.a(), new ClipData.Item(o03Var.c()));
        if (i2 >= 31) {
            l01Var = new bq0(clipData, 2);
        } else {
            m01 m01Var = new m01();
            m01Var.B = clipData;
            m01Var.L = 2;
            l01Var = m01Var;
        }
        l01Var.F(o03Var.g());
        l01Var.setExtras(bundle);
        if (aa7.j(xqVar, l01Var.build()) != null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.j90
    public Object i(i90 i90Var) {
        fq3 fq3Var;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((p63) obj).R(new j0(17, i90Var));
                return "Job.asListenableFuture";
            case 3:
                bf0 bf0Var = (bf0) obj;
                synchronized (bf0Var.a) {
                    bf0Var.e = i90Var;
                }
                return "CameraRepository-deinit";
            default:
                xg0 xg0Var = (xg0) obj;
                xg0Var.n.f();
                if (xg0Var.o.a()) {
                    zq5 zq5Var = (zq5) xg0Var.o.getValue();
                    synchronized (zq5Var.a) {
                        zq5Var.b.disable();
                        zq5Var.c.clear();
                        zq5Var.d = -1;
                    }
                }
                bf0 bf0Var2 = xg0Var.a;
                synchronized (bf0Var2.a) {
                    try {
                        boolean isEmpty = bf0Var2.b.isEmpty();
                        fq3Var = bf0Var2.d;
                        if (isEmpty) {
                            if (fq3Var == null) {
                                fq3Var = jx2.L;
                            }
                        } else {
                            if (fq3Var == null) {
                                fq3Var = ct3.k0(new a31(3, bf0Var2));
                                bf0Var2.d = fq3Var;
                            }
                            bf0Var2.c.addAll(bf0Var2.b.values());
                            for (vd0 vd0Var : bf0Var2.b.values()) {
                                vd0Var.a().a(new we(7, bf0Var2, vd0Var), iq2.l());
                            }
                            bf0Var2.b.clear();
                        }
                    } finally {
                    }
                }
                fq3Var.a(new we(9, xg0Var, i90Var), xg0Var.d);
                return "CameraX shutdownInternal";
        }
    }

    @Override // defpackage.ij2
    public Object apply(Object obj) {
        return (Void) ((cz) this.B).n(obj);
    }
}
