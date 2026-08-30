package d2;

import a5.q0;
import a6.d2;
import a6.i2;
import a6.x0;
import android.graphics.Bitmap;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.d0;
import androidx.profileinstaller.ProfileInstallReceiver;
import d0.b1;
import d0.i1;
import d0.l1;
import d0.y0;
import i3.c0;
import j0.c1;
import j0.d1;
import j0.e1;
import j0.f0;
import j0.h2;
import j0.j0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import me.magnum.melonds.common.camera.DSiCameraSource;
import pi.g0;
import z2.b0;
import zb.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t implements a6.i, q0, gk.n, h7.d, d1, a6.v, k9.g {
    public final /* synthetic */ int A;
    public Object B;

    public t(int i2, byte b10) {
        this.A = i2;
        switch (i2) {
            case 19:
                this.B = new Region();
                return;
            case 20:
            default:
                this.B = n2.s.w(Boolean.FALSE);
                return;
            case 21:
                this.B = new d0();
                new HashMap();
                return;
        }
    }

    public static m9.q B(i1 i1Var, m9.j jVar, k9.a aVar, k9.b bVar) {
        String str;
        boolean z10;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jVar.f9403a.getResources(), bVar.f8094a);
        d9.f fVar = d9.f.MEMORY_CACHE;
        Map map = bVar.f8095b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        boolean z11 = false;
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        Bitmap.Config[] configArr = q9.g.f12393a;
        if (i1Var != null && i1Var.B) {
            z11 = true;
        }
        return new m9.q(bitmapDrawable, jVar, fVar, aVar, str, z10, z11);
    }

    public static l1 v(y0 y0Var) {
        if (y0Var == null) {
            return null;
        }
        return new l1(y0Var, new Size(y0Var.c(), y0Var.a()), new n0.c(new v0.h(null, h2.f7211b, y0Var.q().c())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
        if (r1 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
        if (r2 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
        return new h0.e(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h0.e y(e0.b r5, java.util.List r6) {
        /*
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lc
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto Lc
        La:
            r2 = r1
            goto L21
        Lc:
            java.util.Iterator r2 = r6.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            d0.v1 r3 = (d0.v1) r3
            boolean r3 = r3 instanceof d0.s0
            if (r3 == 0) goto L10
            r2 = r0
        L21:
            if (r6 == 0) goto L2a
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L2a
            goto L45
        L2a:
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r6.next()
            d0.v1 r3 = (d0.v1) r3
            boolean r4 = r3 instanceof d0.f1
            if (r4 != 0) goto L44
            boolean r3 = n0.f.B(r3)
            if (r3 == 0) goto L2e
        L44:
            r1 = r0
        L45:
            g0.b r6 = r5.a()
            int[] r3 = h0.a.f5832a
            int r6 = r6.ordinal()
            r6 = r3[r6]
            r3 = 0
            if (r6 == r0) goto L80
            r0 = 2
            if (r6 == r0) goto L63
            r0 = 3
            if (r6 == r0) goto L63
            r0 = 4
            if (r6 != r0) goto L5e
            goto L63
        L5e:
            m9.o.o()
            r5 = 0
            return r5
        L63:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            f0.g r0 = f0.g.PREVIEW
            r6.append(r0)
            java.lang.String r0 = " or "
            r6.append(r0)
            f0.g r0 = f0.g.VIDEO_CAPTURE
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L7e
            goto L88
        L7e:
            r6 = r3
            goto L88
        L80:
            f0.g r6 = f0.g.IMAGE_CAPTURE
            java.lang.String r6 = r6.toString()
            if (r2 != 0) goto L7e
        L88:
            if (r6 == 0) goto L90
            h0.e r0 = new h0.e
            r0.<init>(r6, r5)
            return r0
        L90:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.t.y(e0.b, java.util.List):h0.e");
    }

    public k9.a A(m9.j jVar, Object obj, m9.n nVar, b9.c cVar) {
        String str;
        Map linkedHashMap;
        jVar.getClass();
        List list = jVar.f9409g;
        List list2 = ((b9.h) this.B).f2128f.f2115c;
        int size = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                yb.j jVar2 = (yb.j) list2.get(i2);
                i9.b bVar = (i9.b) jVar2.A;
                if (((Class) jVar2.B).isAssignableFrom(obj.getClass())) {
                    bVar.getClass();
                    str = bVar.a(obj, nVar);
                    if (str != null) {
                        break;
                    }
                }
                i2++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map = jVar.f9426y.A;
        boolean isEmpty = map.isEmpty();
        zb.r rVar = zb.r.A;
        if (isEmpty) {
            linkedHashMap = rVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                m9.o.b();
                return null;
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new k9.a(str, rVar);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        if (!list.isEmpty()) {
            if (list.size() <= 0) {
                linkedHashMap2.put("coil#transformation_size", nVar.f9432d.toString());
            } else {
                list.get(0).getClass();
                m9.o.b();
                return null;
            }
        }
        return new k9.a(str, linkedHashMap2);
    }

    public void C(Throwable th2) {
        switch (this.A) {
            case 20:
                th2.getClass();
                f0 f0Var = (f0) this.B;
                if (f0Var.f7187h.get()) {
                    aj.g.t("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th2);
                    b1 b1Var = f0Var.f7184e;
                    if (b1Var != null) {
                        b1Var.d();
                        return;
                    }
                    return;
                }
                return;
            default:
                aj.g.t("ObserverToConsumerAdapter", "Unexpected error in Observable", th2);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Iterable] */
    public void D(Object obj) {
        w.j jVar;
        zb.q qVar;
        switch (this.A) {
            case 20:
                List list = (List) obj;
                if (((f0) this.B).f7187h.get() && (jVar = ((f0) this.B).f7182c) != null) {
                    if (list != null) {
                        ArrayList arrayList = new ArrayList(zb.m.G(list, 10));
                        Iterator it = list.iterator();
                        while (true) {
                            qVar = arrayList;
                            if (it.hasNext()) {
                                arrayList.add(((d0.q) it.next()).a());
                            }
                        }
                    } else {
                        qVar = zb.q.A;
                    }
                    try {
                        jVar.e(qVar);
                        LinkedHashSet<String> a10 = jVar.a();
                        ArrayList arrayList2 = new ArrayList(zb.m.G(a10, 10));
                        for (String str : a10) {
                            str.getClass();
                            arrayList2.add(new d0.q(p7.t.A(str), null));
                        }
                        f0 f0Var = (f0) this.B;
                        List<d0.q> p0 = zb.l.p0(f0Var.f7186g);
                        if (!arrayList2.equals(p0)) {
                            Set s02 = zb.l.s0(p0);
                            Set s03 = zb.l.s0(arrayList2);
                            Set<d0.q> A = p7.j.A(s03, s02);
                            Set<d0.q> A2 = p7.j.A(s02, s03);
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList(zb.m.G(arrayList2, 10));
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                arrayList4.add(((d0.q) obj2).a());
                            }
                            try {
                                for (d0.q qVar2 : A2) {
                                    f0Var.c(qVar2.a());
                                }
                                j0 j0Var = f0Var.f7183d;
                                if (j0Var != null) {
                                    aj.g.o("CameraPresencePrvdr", "Updating CameraRepository...");
                                    j0Var.a(arrayList4);
                                    arrayList3.add(j0Var);
                                    aj.g.o("CameraPresencePrvdr", "CameraRepository updated successfully.");
                                }
                                if (!f0Var.f7188i.isEmpty()) {
                                    aj.g.o("CameraPresencePrvdr", "Updating " + f0Var.f7188i.size() + " dependent listeners...");
                                    Iterator it2 = f0Var.f7188i.iterator();
                                    while (it2.hasNext()) {
                                        e1 e1Var = (e1) it2.next();
                                        e1Var.a(arrayList4);
                                        arrayList3.add(e1Var);
                                    }
                                }
                                f0Var.f7186g = arrayList2;
                                for (d0.q qVar3 : A) {
                                    f0Var.a(qVar3.a());
                                }
                                f0Var.b(A, A2);
                                return;
                            } catch (Exception e6) {
                                aj.g.t("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e6);
                                ArrayList arrayList5 = new ArrayList(zb.m.G(p0, 10));
                                for (d0.q qVar4 : p0) {
                                    arrayList5.add(qVar4.a());
                                }
                                Iterator it3 = new w(arrayList3).iterator();
                                while (true) {
                                    b0 b0Var = (b0) it3;
                                    if (((ListIterator) b0Var.B).hasPrevious()) {
                                        e1 e1Var2 = (e1) ((ListIterator) b0Var.B).previous();
                                        try {
                                            e1Var2.a(arrayList5);
                                        } catch (Exception e10) {
                                            aj.g.t("CameraPresencePrvdr", "Failed to rollback listener: " + e1Var2, e10);
                                        }
                                    } else {
                                        for (d0.q qVar5 : A2) {
                                            f0Var.a(qVar5.a());
                                        }
                                        for (d0.q qVar6 : A) {
                                            f0Var.c(qVar6.a());
                                        }
                                        return;
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    } catch (Exception e11) {
                        aj.g.t("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e11);
                        b1 b1Var = ((f0) this.B).f7184e;
                        if (b1Var != null) {
                            b1Var.d();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                ((z5.a) this.B).accept(obj);
                return;
        }
    }

    public void E(float f8, float f10, long j2) {
        i3.q p10 = ((a4.n) this.B).p();
        int i2 = (int) (j2 >> 32);
        int i10 = (int) (j2 & 4294967295L);
        p10.k(Float.intBitsToFloat(i2), Float.intBitsToFloat(i10));
        p10.d(f8, f10);
        p10.k(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i10));
    }

    public void F(float f8, float f10) {
        ((a4.n) this.B).p().k(f8, f10);
    }

    @Override // j0.d1
    public int a() {
        return ((d0.c) this.B).a();
    }

    @Override // j0.d1
    public void b(c1 c1Var, Executor executor) {
        ((d0.c) this.B).b(new bi.h(7, this, c1Var), executor);
    }

    @Override // j0.d1
    public int c() {
        return ((d0.c) this.B).c();
    }

    @Override // j0.d1
    public void close() {
        ((d0.c) this.B).close();
    }

    @Override // a5.q0
    public long d(x4.k kVar, long j2, x4.m mVar, long j10) {
        long j11;
        boolean z10;
        int i2 = kVar.f14342a + ((int) (((x4.j) ((mc.a) this.B).b()).f14340a >> 32));
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j2 >> 32);
        if (mVar == x4.m.Ltr) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (g1.b.a(i2, i10, i11, z10) << 32) | (g1.b.a(kVar.f14343b + ((int) (j11 & 4294967295L)), (int) (j10 & 4294967295L), (int) (j2 & 4294967295L), true) & 4294967295L);
    }

    @Override // j0.d1
    public y0 e() {
        return v(((d0.c) this.B).e());
    }

    @Override // j0.d1
    public int f() {
        return ((d0.c) this.B).f();
    }

    @Override // gk.n
    public Object g(Object obj) {
        return Optional.ofNullable(((gk.n) this.B).g((g0) obj));
    }

    @Override // j0.d1
    public Surface getSurface() {
        return ((d0.c) this.B).getSurface();
    }

    @Override // j0.d1
    public void h() {
        ((d0.c) this.B).h();
    }

    @Override // a6.i
    public boolean i(float f8) {
        if (f8 == 0.0f) {
            return false;
        }
        r();
        ((NestedScrollView) this.B).j((int) f8);
        return true;
    }

    @Override // k9.g
    public void j(k9.a aVar, Bitmap bitmap, Map map) {
        ((bk.a) this.B).s(aVar, bitmap, map, p7.t.k(bitmap));
    }

    @Override // h7.d
    public void k() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // h7.d
    public void m(int i2, Object obj) {
        String str;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
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
            case l1.c.f8511g /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case l1.c.f8509e /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case l1.c.f8508d /* 9 */:
            default:
                str = "";
                break;
            case l1.c.f8510f /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 != 6 && i2 != 7 && i2 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.B).setResultCode(i2);
    }

    @Override // j0.d1
    public int n() {
        return ((d0.c) this.B).n();
    }

    @Override // a6.i
    public float o() {
        return -((NestedScrollView) this.B).getVerticalScrollFactorCompat();
    }

    @Override // j0.d1
    public y0 p() {
        return v(((d0.c) this.B).p());
    }

    @Override // k9.g
    public k9.b q(k9.a aVar) {
        return null;
    }

    @Override // a6.i
    public void r() {
        ((NestedScrollView) this.B).R.abortAnimation();
    }

    @Override // a6.v
    public i2 s(View view, i2 i2Var) {
        boolean z10;
        d2 d2Var = i2Var.f479a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.B;
        if (!Objects.equals(coordinatorLayout.f1181k0, i2Var)) {
            coordinatorLayout.f1181k0 = i2Var;
            boolean z11 = true;
            if (i2Var.d() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            coordinatorLayout.f1182l0 = z10;
            coordinatorLayout.setWillNotDraw((z10 || coordinatorLayout.getBackground() != null) ? false : false);
            if (!d2Var.n()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    WeakHashMap weakHashMap = x0.f533a;
                    if (childAt.getFitsSystemWindows() && ((k5.d) childAt.getLayoutParams()).f7968a != null && d2Var.n()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return i2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dc.a t(dd.j r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof k7.l
            if (r0 == 0) goto L13
            r0 = r6
            k7.l r0 = (k7.l) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            k7.l r0 = new k7.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
        L28:
            r5 = 0
            return r5
        L2a:
            p7.j.I(r6)
            goto L3e
        L2e:
            p7.j.I(r6)
            java.lang.Object r6 = r4.B
            cd.q1 r6 = (cd.q1) r6
            r0.Y = r3
            java.lang.Object r5 = r6.c(r5, r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            wa.b.a()
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.t.t(dd.j, ec.c):dc.a");
    }

    public e9.g u() {
        e9.c m;
        e9.a aVar = (e9.a) this.B;
        e9.e eVar = (e9.e) aVar.f4417d;
        synchronized (eVar) {
            aVar.e(true);
            m = eVar.m(((e9.b) aVar.f4415b).f4418a);
        }
        if (m != null) {
            return new e9.g(m);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0151, code lost:
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
        if (r7 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0136, code lost:
        if (r1 <= 1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0142, code lost:
        if (java.lang.Math.abs(r2 - r5) <= r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x014a, code lost:
        if (r0 != false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0158 A[RETURN] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k9.b w(m9.j r18, k9.a r19, n9.g r20, n9.f r21) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.t.w(m9.j, k9.a, n9.g, n9.f):k9.b");
    }

    public h0.f x(b1 b1Var, ArrayList arrayList, int i2, List list) {
        if (i2 >= arrayList.size()) {
            LinkedHashSet D = p7.j.D((Set) b1Var.f3336f, list);
            aj.g.o("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + D + ", useCases = " + ((List) b1Var.f3334d));
            j0.b0 b0Var = (j0.b0) this.B;
            f0.c cVar = new f0.c(D);
            Iterator it = D.iterator();
            while (true) {
                if (it.hasNext()) {
                    e0.b bVar = (e0.b) it.next();
                    if (!bVar.b(b1Var, b0Var)) {
                        aj.g.o("CameraInfoInternal", bVar + " is not supported.");
                        break;
                    }
                } else {
                    try {
                        q8.r.V(b0Var, b1Var, cVar);
                        return new h0.b(new f0.c(D));
                    } catch (IllegalArgumentException | n0.d e6) {
                        aj.g.p("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e6);
                    }
                }
            }
            return h0.c.f5834a;
        }
        int i10 = i2 + 1;
        h0.f x9 = x(b1Var, arrayList, i10, zb.l.d0(list, arrayList.get(i2)));
        if (x9 instanceof h0.b) {
            return x9;
        }
        return x(b1Var, arrayList, i10, list);
    }

    public void z(float f8, float f10, float f11, float f12) {
        a4.n nVar = (a4.n) this.B;
        i3.q p10 = nVar.p();
        float intBitsToFloat = Float.intBitsToFloat((int) (nVar.t() >> 32)) - (f11 + f8);
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (nVar.t() & 4294967295L)) - (f12 + f10)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            c0.a("Width and height must be greater than or equal to zero");
        }
        nVar.J(floatToRawIntBits);
        p10.k(f8, f10);
    }

    @Override // k9.g
    public void l(int i2) {
    }

    public /* synthetic */ t(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    public t(b9.h hVar, jb.c cVar) {
        this.A = 29;
        this.B = hVar;
    }

    public /* synthetic */ t(char c4, int i2) {
        this.A = i2;
    }

    public t(int i2) {
        this.A = 27;
        this.B = cd.q.c(new int[i2]);
    }
}
