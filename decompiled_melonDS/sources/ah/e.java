package ah;

import a6.d2;
import a6.i2;
import android.content.ClipData;
import android.content.Context;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import cd.q1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements a6.v, a8.k, androidx.preference.p, b5.j, j0.c1, u7.b, wa.p, m0.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ e(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // androidx.preference.p
    public void a(Preference preference) {
        String str;
        h.c cVar = (h.c) this.B;
        Uri uri = null;
        Set<String> persistedStringSet = preference.getPersistedStringSet(null);
        if (persistedStringSet != null && (str = (String) zb.l.S(persistedStringSet)) != null) {
            uri = Uri.parse(str);
        }
        cVar.a(uri);
    }

    @Override // m0.a
    public ta.a apply(Object obj) {
        return (ta.a) ((mh.z) this.B).k(obj);
    }

    public void b(d0.l1 l1Var) {
        yb.j jVar;
        float f8;
        byte b10;
        switch (this.A) {
            case l1.c.f8509e /* 6 */:
                ((e) this.B).b(l1Var);
                return;
            default:
                lf.d dVar = (lf.d) this.B;
                d0.y0 y0Var = l1Var.B;
                ByteBuffer b11 = y0Var.l()[0].b();
                b11.getClass();
                d0.x0 x0Var = y0Var.l()[1];
                d0.x0 x0Var2 = y0Var.l()[2];
                b11.rewind();
                x0Var.b().rewind();
                x0Var2.b().rewind();
                int i2 = l1Var.Y;
                int i10 = l1Var.Z;
                d0.t0 t0Var = l1Var.X;
                t0Var.getClass();
                bk.a aVar = dVar.f9080f;
                float[] fArr = dVar.f9084j;
                if (i2 != 0) {
                    if (i10 != 0) {
                        if (b11.remaining() != 0) {
                            if (x0Var.b().remaining() != 0) {
                                if (x0Var.u() != 0) {
                                    if (x0Var.v() != 0) {
                                        if (x0Var2.b().remaining() != 0) {
                                            if (x0Var2.u() != 0) {
                                                if (x0Var2.v() != 0) {
                                                    if (t0Var.d() != 90 && t0Var.d() != 270) {
                                                        jVar = new yb.j(Integer.valueOf(i2), Integer.valueOf(i10));
                                                    } else {
                                                        jVar = new yb.j(Integer.valueOf(i10), Integer.valueOf(i2));
                                                    }
                                                    float intValue = ((Number) jVar.A).intValue();
                                                    float intValue2 = ((Number) jVar.B).intValue();
                                                    if (intValue / intValue2 > 1.3333334f) {
                                                        f8 = intValue2 / 480.0f;
                                                    } else {
                                                        f8 = intValue / 640.0f;
                                                    }
                                                    Matrix matrix = new Matrix();
                                                    matrix.setTranslate(-319.5f, -239.5f);
                                                    matrix.postRotate(-t0Var.d());
                                                    matrix.postScale(f8, f8);
                                                    Matrix matrix2 = new Matrix();
                                                    if (t0Var.d() != 90 && t0Var.d() != 270) {
                                                        matrix2.setTranslate((intValue / 640.0f) * 319.5f, (intValue2 / 480.0f) * 239.5f);
                                                    } else {
                                                        matrix2.setTranslate((intValue2 / 480.0f) * 239.5f, (intValue / 640.0f) * 319.5f);
                                                    }
                                                    matrix.mapPoints(fArr, dVar.f9083i);
                                                    matrix2.mapPoints(fArr);
                                                    int u4 = i2 / x0Var.u();
                                                    int remaining = i10 / (x0Var.b().remaining() / x0Var.u());
                                                    int u10 = i2 / x0Var2.u();
                                                    int remaining2 = i10 / (x0Var2.b().remaining() / x0Var2.u());
                                                    byte[][] bArr = (byte[][]) aVar.L;
                                                    byte[] bArr2 = bArr[(aVar.B + 1) % bArr.length];
                                                    for (int i11 = 0; i11 < 480; i11++) {
                                                        int i12 = 0;
                                                        while (i12 < 640) {
                                                            int i13 = ((i11 * 640) + i12) * 2;
                                                            int i14 = (int) fArr[i13];
                                                            int i15 = i13 + 1;
                                                            int i16 = u4;
                                                            int i17 = (int) fArr[i15];
                                                            bArr2[i13] = b11.get((i17 * i2) + i14);
                                                            if (i12 % 2 == 0) {
                                                                b10 = x0Var.b().get((x0Var.v() * ((i14 / i16) / x0Var.v())) + (((i17 / remaining) * i2) / i16));
                                                            } else {
                                                                b10 = x0Var2.b().get((x0Var2.v() * ((i14 / u10) / x0Var2.v())) + (((i17 / remaining2) * i2) / u10));
                                                            }
                                                            bArr2[i15] = b10;
                                                            i12++;
                                                            u4 = i16;
                                                        }
                                                    }
                                                    aVar.B = (aVar.B + 1) % ((byte[][]) aVar.L).length;
                                                    l1Var.close();
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

    @Override // j0.c1
    public void c(j0.d1 d1Var) {
        switch (this.A) {
            case 7:
                d0.d1 d1Var2 = (d0.d1) this.B;
                synchronized (d1Var2.A) {
                    d1Var2.L++;
                }
                d1Var2.j(d1Var);
                return;
            default:
                w.m1 m1Var = (w.m1) this.B;
                m1Var.getClass();
                try {
                    d0.y0 e6 = d1Var.e();
                    if (e6 != null) {
                        m1Var.f13998c.c(e6);
                        return;
                    }
                    return;
                } catch (IllegalStateException e10) {
                    aj.g.s("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e10.getMessage());
                    return;
                }
        }
    }

    @Override // wa.p
    public Object d() {
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 18:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e6) {
                    p7.n nVar = za.c.f15005a;
                    m9.o.m("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
                    return null;
                } catch (InstantiationException e10) {
                    String b10 = za.c.b(constructor);
                    throw new RuntimeException("Failed to invoke constructor '" + b10 + "' with no args", e10);
                } catch (InvocationTargetException e11) {
                    m9.o.m("Failed to invoke constructor '" + za.c.b(constructor) + "' with no args", e11.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return wa.y.f14194a.a(cls);
                } catch (Exception e12) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e12);
                }
        }
    }

    @Override // u7.b
    public u7.c e(u7.a aVar) {
        Context context = (Context) this.B;
        String str = aVar.f13498b;
        bk.a aVar2 = aVar.f13499c;
        aVar2.getClass();
        if (str != null && str.length() != 0) {
            return new v7.h(context, str, aVar2, true, true);
        }
        a0.j.h("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }

    public void f() {
        mc.p pVar = (mc.p) this.B;
        synchronized (z2.l.f14919c) {
            z2.l.f14924h = zb.l.c0((List) z2.l.f14924h, pVar);
        }
    }

    public boolean g(a0.b bVar, int i2, Bundle bundle) {
        a6.d dVar;
        q.t tVar = (q.t) this.B;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i2 & 1) != 0) {
            try {
                ((c6.h) bVar.B).e();
                Parcelable parcelable = (Parcelable) ((c6.h) bVar.B).b();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        c6.h hVar = (c6.h) bVar.B;
        ClipData clipData = new ClipData(hVar.a(), new ClipData.Item(hVar.d()));
        if (i10 >= 31) {
            dVar = new a0.b(clipData, 2);
        } else {
            a6.e eVar = new a6.e();
            eVar.B = clipData;
            eVar.L = 2;
            dVar = eVar;
        }
        dVar.K(hVar.f());
        dVar.setExtras(bundle);
        if (a6.x0.k(tVar, dVar.build()) != null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, b5.n] */
    @Override // b5.j
    public Object h(b5.i iVar) {
        ta.a aVar;
        switch (this.A) {
            case l1.c.f8511g /* 5 */:
                d0.w wVar = (d0.w) this.B;
                wVar.f3496n.e();
                j0.j0 j0Var = wVar.f3484a;
                synchronized (j0Var.f7222a) {
                    try {
                        boolean isEmpty = j0Var.f7223b.isEmpty();
                        ta.a aVar2 = j0Var.f7225d;
                        ta.a aVar3 = aVar2;
                        ta.a aVar4 = aVar2;
                        if (isEmpty) {
                            if (aVar2 == null) {
                                aVar3 = m0.k.L;
                            }
                        } else {
                            if (aVar2 == null) {
                                ?? obj = new Object();
                                obj.f2053c = new Object();
                                b5.l lVar = new b5.l(obj);
                                obj.f2052b = lVar;
                                obj.f2051a = w.d.class;
                                try {
                                    synchronized (j0Var.f7222a) {
                                        j0Var.f7226e = obj;
                                    }
                                    obj.f2051a = "CameraRepository-deinit";
                                } catch (Exception e6) {
                                    lVar.b(e6);
                                }
                                j0Var.f7225d = lVar;
                                aVar4 = lVar;
                            }
                            j0Var.f7224c.addAll(j0Var.f7223b.values());
                            for (j0.d0 d0Var : j0Var.f7223b.values()) {
                                d0Var.a().a(new ad.c(12, j0Var, d0Var), ij.a.D());
                            }
                            j0Var.f7223b.clear();
                            aVar = aVar4;
                        }
                    } finally {
                    }
                }
                aVar.a(new ad.c(3, wVar, iVar), wVar.f3487d);
                return "CameraX shutdownInternal";
            default:
                d0.b1 b1Var = (d0.b1) this.B;
                ((Executor) b1Var.f3337g).execute(new w.g(4, b1Var, iVar));
                return "FetchData for CameraAvailability";
        }
    }

    @Override // a6.v
    public i2 s(View view, i2 i2Var) {
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 0:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj;
                int i10 = EmulatorActivity.f9503a1;
                view.getClass();
                q5.b f8 = i2Var.f479a.f(128);
                f8.getClass();
                int i11 = f8.f12284b;
                int i12 = f8.f12286d;
                int i13 = f8.f12285c;
                int i14 = f8.f12283a;
                d5.f fVar = emulatorActivity.f9504y0;
                if (fVar != null) {
                    ((RecyclerView) fVar.f3842d).setPadding(i14, 0, i13, i12);
                    d5.f fVar2 = emulatorActivity.f9504y0;
                    if (fVar2 != null) {
                        TextView textView = (TextView) fVar2.f3844f;
                        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                        if (layoutParams != null) {
                            i5.f fVar3 = (i5.f) layoutParams;
                            fVar3.setMargins(i14, i11, i13, i12);
                            textView.setLayoutParams(fVar3);
                            ve.b bVar = new ve.b(i14, i11, i13, i12);
                            q1 q1Var = (q1) emulatorActivity.C().f772k.f3841c;
                            q1Var.getClass();
                            q1Var.k(null, bVar);
                            return i2.f478b;
                        }
                        m9.o.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        return null;
                    }
                    nc.k.f("binding");
                    throw null;
                }
                nc.k.f("binding");
                throw null;
            case 8:
                d6.g gVar = (d6.g) obj;
                ArrayList arrayList = gVar.f3914b;
                d2 d2Var = i2Var.f479a;
                q5.b b10 = q5.b.b(d2Var.f(519), d2Var.f(64));
                q5.b b11 = q5.b.b(d2Var.g(519), d2Var.g(64));
                if (!b10.equals(gVar.f3915c) || !b11.equals(gVar.f3916d)) {
                    gVar.f3915c = b10;
                    gVar.f3916d = b11;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        d6.c cVar = (d6.c) arrayList.get(size);
                        cVar.f3909c = b10;
                        cVar.f3910d = b11;
                        cVar.c();
                    }
                }
                return i2Var;
            case 13:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) obj;
                int i15 = LayoutEditorActivity.K0;
                view.getClass();
                q5.b f10 = i2Var.f479a.f(128);
                f10.getClass();
                ve.b bVar2 = new ve.b(f10.f12283a, f10.f12284b, f10.f12285c, f10.f12286d);
                layoutEditorActivity.B();
                q1 q1Var2 = (q1) layoutEditorActivity.A().f12728d.f3841c;
                q1Var2.getClass();
                q1Var2.k(null, bVar2);
                return i2Var;
            default:
                view.getClass();
                q5.b f11 = i2Var.f479a.f(128);
                f11.getClass();
                le.a aVar = ((me.magnum.melonds.ui.layouteditor.b) obj).L;
                ScrollView scrollView = aVar.f9057j;
                int i16 = f11.f12283a;
                int i17 = f11.f12285c;
                int i18 = f11.f12286d;
                scrollView.setPadding(i16, 0, i17, i18);
                aVar.f9055h.setPadding(i16, 0, i17, i18);
                return i2.f478b;
        }
    }
}
