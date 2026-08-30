package p7;

import a5.z;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;
import j0.n2;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l4.i0;
import l4.q0;
import me.magnum.melonds.R;
import pi.a0;
import w.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11426a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11427b = 0;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(v3.f0 r7, ec.a r8) {
        /*
            boolean r0 = r8 instanceof y1.a
            if (r0 == 0) goto L13
            r0 = r8
            y1.a r0 = (y1.a) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            y1.a r0 = new y1.a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            v3.f0 r7 = r0.R
            p7.j.I(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L30:
            p7.j.I(r8)
        L33:
            r0.R = r7
            r0.Y = r3
            v3.l r8 = v3.l.Main
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            v3.k r8 = (v3.k) r8
            int r2 = r8.f13681d
            java.lang.Object r8 = r8.f13678a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            v3.t r6 = (v3.t) r6
            boolean r6 = v3.s.a(r6)
            if (r6 != 0) goto L5f
            goto L33
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.o.a(v3.f0, ec.a):java.lang.Object");
    }

    public static final void b(StringBuilder sb2, int i2) {
        for (int i10 = 0; i10 < i2; i10++) {
            sb2.append("?");
            if (i10 < i2 - 1) {
                sb2.append(",");
            }
        }
    }

    public static void c(int i2, int i10, int i11) {
        if (i2 >= 0 && i10 <= i11) {
            if (i2 <= i10) {
                return;
            }
            a0.j.h(kc.a.d(i2, i10, "startIndex: ", " > endIndex: "));
            return;
        }
        a0.j.l(kc.a.j("startIndex: ", i2, ", endIndex: ", i10, ", size: "), i11);
    }

    public static void d(int i2, int i10, int i11) {
        if (i2 >= 0 && i10 <= i11) {
            if (i2 <= i10) {
                return;
            }
            a0.j.h(kc.a.d(i2, i10, "fromIndex: ", " > toIndex: "));
            return;
        }
        a0.j.l(kc.a.j("fromIndex: ", i2, ", toIndex: ", i10, ", size: "), i11);
    }

    public static int e(int i2, int i10, int i11) {
        if (i2 < i10) {
            return i10;
        }
        if (i2 > i11) {
            return i11;
        }
        return i2;
    }

    public static a0 f(String str, pi.t tVar) {
        Charset charset = vc.a.f13781a;
        Charset a10 = pi.t.a(tVar);
        if (a10 == null) {
            try {
                tVar = n.i(tVar + "; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                tVar = null;
            }
        } else {
            charset = a10;
        }
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        qi.e.a(bytes.length, 0, length);
        return new a0(tVar, length, bytes);
    }

    public static int g(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("ShaderFactory", GLES20.glGetShaderInfoLog(glCreateShader));
        }
        return glCreateShader;
    }

    public static xd.a h(xd.d dVar) {
        int i2;
        dVar.getClass();
        int g10 = g(35633, dVar.f14551b);
        int g11 = g(35632, dVar.f14552c);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, g10);
        GLES20.glAttachShader(glCreateProgram, g11);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("ShaderFactory", GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        int i10 = xd.b.f14540a[dVar.f14550a.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                i2 = 9729;
            } else {
                m9.o.o();
                return null;
            }
        } else {
            i2 = 9728;
        }
        return new xd.a(g10, g11, glCreateProgram, i2);
    }

    public static final q7.f j(View view) {
        q7.f fVar;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            if (tag instanceof q7.f) {
                fVar = (q7.f) tag;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                return fVar;
            }
            ViewParent D = a.a.D(view);
            if (D instanceof View) {
                view = (View) D;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static Object k(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return z.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static int l(n2 n2Var, int i2) {
        int i10 = h1.f13948a[n2Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 || z.a.f14847a.j(PreviewUnderExposureQuirk.class) != null) {
                return 1;
            }
            return 3;
        } else if (i2 != 2) {
            return 1;
        } else {
            return 5;
        }
    }

    public static final oi.f m(je.g gVar) {
        je.d dVar = gVar.f7848a;
        long j2 = dVar.f7838a;
        String str = dVar.f7839b;
        String str2 = dVar.f7840c;
        URL url = new URL(dVar.f7841d);
        List list = gVar.f7849b;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(zb.m.G(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            je.c cVar = (je.c) it.next();
            List<je.a> list2 = cVar.f7836b;
            ArrayList arrayList2 = new ArrayList(zb.m.G(list2, i2));
            for (je.a aVar : list2) {
                arrayList2.add(n.o(aVar));
            }
            List<je.h> list3 = cVar.f7837c;
            ArrayList arrayList3 = new ArrayList(zb.m.G(list3, i2));
            for (je.h hVar : list3) {
                hVar.getClass();
                arrayList3.add(new oi.h(hVar.f7850a, hVar.f7851b, hVar.f7852c, hVar.f7853d, hVar.f7854e, hVar.f7855f, hVar.f7856g, hVar.f7857h, hVar.f7858i));
                cVar = cVar;
                it = it;
            }
            Iterator it2 = it;
            je.b bVar = cVar.f7835a;
            long j10 = bVar.f7830a;
            long j11 = bVar.f7831b;
            String str3 = bVar.f7832c;
            oi.c valueOf = oi.c.valueOf(bVar.f7833d);
            URL url2 = new URI(bVar.f7834e).toURL();
            url2.getClass();
            arrayList.add(new oi.d(j10, j11, str3, url2, arrayList2, arrayList3, valueOf));
            it = it2;
            i2 = 10;
        }
        return new oi.f(j2, str2, url, str, arrayList);
    }

    public static final x4.k o(h3.c cVar) {
        return new x4.k(Math.round(cVar.f6052a), Math.round(cVar.f6053b), Math.round(cVar.f6054c), Math.round(cVar.f6055d));
    }

    public static final long p(long j2, long j10) {
        boolean z10;
        boolean z11;
        int d4;
        boolean z12;
        boolean z13;
        boolean z14;
        int f8 = q0.f(j2);
        int e6 = q0.e(j2);
        boolean z15 = false;
        if (q0.f(j10) < q0.e(j2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (q0.f(j2) < q0.e(j10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            if (q0.f(j10) <= q0.f(j2)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (q0.e(j2) <= q0.e(j10)) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z12 & z13) {
                f8 = q0.f(j10);
                e6 = f8;
            } else {
                if (q0.f(j2) <= q0.f(j10)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (q0.e(j10) <= q0.e(j2)) {
                    z15 = true;
                }
                if (z14 & z15) {
                    d4 = q0.d(j10);
                } else {
                    int f10 = q0.f(j10);
                    if (f8 < q0.e(j10) && f10 <= f8) {
                        f8 = q0.f(j10);
                        d4 = q0.d(j10);
                    } else {
                        e6 = q0.f(j10);
                    }
                }
                e6 -= d4;
            }
        } else if (e6 > q0.f(j10)) {
            f8 -= q0.d(j10);
            d4 = q0.d(j10);
            e6 -= d4;
        }
        return i0.b(f8, e6);
    }

    public abstract Object i(nc.e eVar);

    public abstract o n(nc.e eVar, Object obj);
}
