package a0;

import a4.i0;
import a4.o0;
import a4.q;
import a6.v;
import android.content.Context;
import android.graphics.Insets;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.d0;
import androidx.preference.p;
import androidx.preference.w;
import b3.o;
import d2.t;
import f1.f1;
import gk.a0;
import gk.r0;
import gk.y0;
import h1.p0;
import j0.j2;
import j0.l2;
import j0.v1;
import j0.w1;
import j7.p1;
import j7.r1;
import j7.s0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import me.magnum.melonds.ui.emulator.render.FrameRenderCallback;
import n2.s;
import pi.g0;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements p, p0, gk.g, gk.h, pi.h, v, gk.n, FrameRenderCallback {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    public g(int i2) {
        this.A = i2;
        switch (i2) {
            case 8:
                this.B = new p2.b(new Reference[16]);
                this.L = new ReferenceQueue();
                return;
            case 19:
                this.B = new w3.d();
                this.L = new w3.d();
                return;
            case 26:
                this.B = new SparseIntArray();
                this.L = new SparseIntArray();
                return;
            default:
                this.B = new p2.b(new o0[16]);
                return;
        }
    }

    public static void j(o0 o0Var) {
        if (o0Var.I0 > 0) {
            if (o0Var.B0.f337d == i0.Idle && !o0Var.p() && !o0Var.q() && !o0Var.J0 && o0Var.I()) {
                o oVar = o0Var.A0.f268f;
                if ((oVar.R & 256) != 0) {
                    while (oVar != null) {
                        if ((oVar.L & 256) != 0) {
                            o oVar2 = oVar;
                            p2.b bVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof q) {
                                    q qVar = (q) oVar2;
                                    qVar.b0(a4.l.r(qVar, 256));
                                } else if ((oVar2.L & 256) != 0 && (oVar2 instanceof a4.k)) {
                                    int i2 = 0;
                                    for (o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                        if ((oVar3.L & 256) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    bVar.b(oVar2);
                                                    oVar2 = null;
                                                }
                                                bVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oVar2 = a4.l.e(bVar);
                            }
                        }
                        if ((oVar.R & 256) == 0) {
                            break;
                        }
                        oVar = oVar.Y;
                    }
                }
            }
            o0Var.H0 = false;
            p2.b z10 = o0Var.z();
            Object[] objArr = z10.A;
            int i10 = z10.L;
            for (int i11 = 0; i11 < i10; i11++) {
                j((o0) objArr[i11]);
            }
        }
    }

    public static int t(int i2, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i2; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        if (i11 + 1 > i10) {
            return i12 + 1;
        }
        return i12;
    }

    public void A() {
        if (((s3.b) this.L) != null) {
            this.L = null;
            ((f1.g) this.B).V0(true);
        }
    }

    public void B(String str, w1 w1Var, l2 l2Var, j0.k kVar, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.L;
        if (!linkedHashMap.containsKey(str)) {
            return;
        }
        j2 j2Var = new j2(w1Var, l2Var, kVar, list);
        j2 j2Var2 = (j2) linkedHashMap.get(str);
        j2Var.f7232e = j2Var2.f7232e;
        j2Var.f7233f = j2Var2.f7233f;
        linkedHashMap.put(str, j2Var);
    }

    @Override // androidx.preference.p
    public void a(Preference preference) {
        ((PreferenceGroup) this.B).Y = Preference.DEFAULT_ORDER;
        d0 d0Var = (d0) this.L;
        Handler handler = d0Var.f1543h;
        w wVar = d0Var.f1544i;
        handler.removeCallbacks(wVar);
        handler.post(wVar);
    }

    @Override // gk.h
    public void b(gk.e eVar, r0 r0Var) {
        ((gk.o) this.L).A.execute(new i(this, (gk.h) this.B, r0Var, 3));
    }

    @Override // gk.h
    public void c(gk.e eVar, Throwable th2) {
        ((gk.o) this.L).A.execute(new i(this, (gk.h) this.B, th2, 4));
    }

    @Override // gk.g
    public Object d(a0 a0Var) {
        Executor executor = (Executor) this.L;
        if (executor == null) {
            return a0Var;
        }
        return new gk.o(executor, a0Var);
    }

    @Override // gk.g
    public Type e() {
        return (Type) this.B;
    }

    @Override // h1.p0
    public Object f(f1 f1Var, mc.p pVar, ec.j jVar) {
        Object a10 = ((g2.n) this.L).a(f1Var, new g2.l(this, pVar, null), jVar);
        if (a10 == dc.a.COROUTINE_SUSPENDED) {
            return a10;
        }
        return y.f14813a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Throwable] */
    @Override // gk.n
    public Object g(Object obj) {
        Charset charset;
        g0 g0Var = (g0) obj;
        g0Var.getClass();
        t tVar = (t) this.L;
        jd.a aVar = (jd.a) this.B;
        fj.g m = g0Var.m();
        String th2 = null;
        try {
            pi.t i2 = g0Var.i();
            if (i2 == null || (charset = pi.t.a(i2)) == null) {
                charset = vc.a.f13781a;
            }
            String S = m.S(qi.g.e(m, charset));
            try {
                m.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
            String str = th2;
            th2 = S;
            th = str;
        } catch (Throwable th4) {
            th = th4;
            if (m != null) {
                try {
                    m.close();
                } catch (Throwable th5) {
                    p7.t.a(th, th5);
                }
            }
        }
        if (th == 0) {
            return ((od.c) tVar.B).b(th2, aVar);
        }
        throw th;
    }

    @Override // pi.h
    public void h(ti.n nVar, pi.d0 d0Var) {
        gk.h hVar = (gk.h) this.B;
        a0 a0Var = (a0) this.L;
        try {
            try {
                hVar.b(a0Var, a0Var.c(d0Var));
            } catch (Throwable th2) {
                y0.r(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            y0.r(th3);
            try {
                hVar.c(a0Var, th3);
            } catch (Throwable th4) {
                y0.r(th4);
                th4.printStackTrace();
            }
        }
    }

    public void i() {
        int[] iArr = (int[]) this.B;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.L = null;
    }

    public void k(int i2) {
        int[] iArr = (int[]) this.B;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i2, 10) + 1];
            this.B = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i2 >= iArr.length) {
            int length = iArr.length;
            while (length <= i2) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.B = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.B;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View l(int i2, int i10, int i11, int i12) {
        int i13;
        View u4;
        r1 r1Var = (r1) this.L;
        s0 s0Var = (s0) this.B;
        int d4 = s0Var.d();
        int c4 = s0Var.c();
        if (i10 > i2) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i2 != i10) {
            switch (s0Var.f7668a) {
                case 0:
                    u4 = s0Var.f7669b.u(i2);
                    break;
                default:
                    u4 = s0Var.f7669b.u(i2);
                    break;
            }
            int b10 = s0Var.b(u4);
            int a10 = s0Var.a(u4);
            r1Var.f7662b = d4;
            r1Var.f7663c = c4;
            r1Var.f7664d = b10;
            r1Var.f7665e = a10;
            if (i11 != 0) {
                r1Var.f7661a = i11;
                if (r1Var.a()) {
                    return u4;
                }
            }
            if (i12 != 0) {
                r1Var.f7661a = i12;
                if (r1Var.a()) {
                    view = u4;
                }
            }
            i2 += i13;
        }
        return view;
    }

    @Override // pi.h
    public void m(ti.n nVar, IOException iOException) {
        try {
            ((gk.h) this.B).c((a0) this.L, iOException);
        } catch (Throwable th2) {
            y0.r(th2);
            th2.printStackTrace();
        }
    }

    public v1 n() {
        v1 v1Var = new v1();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.L).entrySet()) {
            j2 j2Var = (j2) entry.getValue();
            if (j2Var.f7233f && j2Var.f7232e) {
                v1Var.a(j2Var.f7228a);
                arrayList.add((String) entry.getKey());
            }
        }
        aj.g.o("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + ((String) this.B));
        return v1Var;
    }

    public v1 o() {
        v1 v1Var = new v1();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.L).entrySet()) {
            j2 j2Var = (j2) entry.getValue();
            if (j2Var.f7232e) {
                v1Var.a(j2Var.f7228a);
                arrayList.add((String) entry.getKey());
            }
        }
        aj.g.o("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.B));
        return v1Var;
    }

    public Collection p() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.L).entrySet()) {
            if (((j2) entry.getValue()).f7232e) {
                arrayList.add(((j2) entry.getValue()).f7228a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection q() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.L).entrySet()) {
            if (((j2) entry.getValue()).f7232e) {
                arrayList.add(((j2) entry.getValue()).f7229b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public v0 r() {
        return (v0) ((n2.f1) this.L).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r9.a(r10) == false) goto L11;
     */
    @Override // me.magnum.melonds.ui.emulator.render.FrameRenderCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void renderFrame(boolean r17, int r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.g.renderFrame(boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    @Override // a6.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a6.i2 s(android.view.View r20, a6.i2 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Object r3 = r0.B
            a0.l r3 = (a0.l) r3
            java.lang.Object r4 = r0.L
            ha.k r4 = (ha.k) r4
            int r5 = r4.f6440a
            int r6 = r4.f6441b
            int r4 = r4.f6442c
            a6.d2 r7 = r2.f479a
            r8 = 519(0x207, float:7.27E-43)
            q5.b r8 = r7.f(r8)
            r9 = 32
            q5.b r7 = r7.f(r9)
            java.lang.Object r9 = r3.B
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.f12284b
            int r11 = r8.f12285c
            int r12 = r8.f12283a
            r9.f2972w = r10
            int r10 = r1.getLayoutDirection()
            r14 = 1
            if (r10 != r14) goto L37
            r10 = r14
            goto L38
        L37:
            r10 = 0
        L38:
            int r15 = r1.getPaddingBottom()
            int r16 = r1.getPaddingLeft()
            int r17 = r1.getPaddingRight()
            boolean r13 = r9.f2964o
            if (r13 == 0) goto L4f
            int r15 = r2.a()
            r9.f2971v = r15
            int r15 = r15 + r4
        L4f:
            boolean r4 = r9.f2965p
            if (r4 == 0) goto L5a
            if (r10 == 0) goto L57
            r4 = r6
            goto L58
        L57:
            r4 = r5
        L58:
            int r16 = r4 + r12
        L5a:
            r4 = r16
            boolean r14 = r9.f2966q
            if (r14 == 0) goto L66
            if (r10 == 0) goto L63
            goto L64
        L63:
            r5 = r6
        L64:
            int r17 = r5 + r11
        L66:
            r5 = r17
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            boolean r10 = r9.f2968s
            if (r10 == 0) goto L7b
            int r10 = r6.leftMargin
            if (r10 == r12) goto L7b
            r6.leftMargin = r12
            r18 = 1
            goto L7d
        L7b:
            r18 = 0
        L7d:
            boolean r10 = r9.f2969t
            if (r10 == 0) goto L89
            int r10 = r6.rightMargin
            if (r10 == r11) goto L89
            r6.rightMargin = r11
            r18 = 1
        L89:
            boolean r10 = r9.f2970u
            if (r10 == 0) goto L97
            int r10 = r6.topMargin
            int r8 = r8.f12284b
            if (r10 == r8) goto L97
            r6.topMargin = r8
            r14 = 1
            goto L99
        L97:
            r14 = r18
        L99:
            if (r14 == 0) goto L9e
            r1.setLayoutParams(r6)
        L9e:
            int r6 = r1.getPaddingTop()
            r1.setPadding(r4, r6, r5, r15)
            boolean r1 = r3.A
            if (r1 == 0) goto Lad
            int r3 = r7.f12286d
            r9.m = r3
        Lad:
            if (r13 != 0) goto Lb3
            if (r1 == 0) goto Lb2
            goto Lb3
        Lb2:
            return r2
        Lb3:
            r9.I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.g.s(android.view.View, a6.i2):a6.i2");
    }

    public String toString() {
        switch (this.A) {
            case l1.c.f8511g /* 5 */:
                return "Bounds{lower=" + ((q5.b) this.B) + " upper=" + ((q5.b) this.L) + "}";
            case l1.c.f8508d /* 9 */:
                String str = "[ ";
                if (((c5.g) this.B) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        StringBuilder t5 = w.d.t(str);
                        t5.append(((c5.g) this.B).f2610b0[i2]);
                        t5.append(" ");
                        str = t5.toString();
                    }
                }
                return str + "] " + ((c5.g) this.B);
            default:
                return super.toString();
        }
    }

    public void u() {
        ((SparseIntArray) this.B).clear();
    }

    public boolean v(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.L;
        if (!linkedHashMap.containsKey(str)) {
            return false;
        }
        return ((j2) linkedHashMap.get(str)).f7232e;
    }

    public boolean w(View view) {
        r1 r1Var = (r1) this.L;
        s0 s0Var = (s0) this.B;
        int d4 = s0Var.d();
        int c4 = s0Var.c();
        int b10 = s0Var.b(view);
        int a10 = s0Var.a(view);
        r1Var.f7662b = d4;
        r1Var.f7663c = c4;
        r1Var.f7664d = b10;
        r1Var.f7665e = a10;
        r1Var.f7661a = 24579;
        return r1Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [yb.k] */
    public void x(String str, Class cls, mc.l lVar) {
        List kVar;
        ua.h hVar = (ua.h) this.L;
        Context context = (Context) this.B;
        File file = new File(context.getFilesDir(), str);
        boolean isFile = file.isFile();
        List<Object> list = zb.q.A;
        if (isFile) {
            Type[] typeArr = {cls};
            TypeVariable[] typeParameters = List.class.getTypeParameters();
            int length = typeParameters.length;
            if (1 == length) {
                if (!Modifier.isStatic(List.class.getModifiers()) && List.class.getDeclaringClass() != null) {
                    throw new IllegalArgumentException("Raw type " + List.class.getName() + " is not supported because it requires specifying an owner type");
                }
                for (int i2 = 0; i2 < length; i2++) {
                    Type type = typeArr[i2];
                    Objects.requireNonNull(type, "Type argument must not be null");
                    Class<?> g10 = wa.i.g(type);
                    TypeVariable typeVariable = typeParameters[i2];
                    Type[] bounds = typeVariable.getBounds();
                    int length2 = bounds.length;
                    int i10 = 0;
                    while (i10 < length2) {
                        int i11 = i10;
                        if (wa.i.g(bounds[i10]).isAssignableFrom(g10)) {
                            i10 = i11 + 1;
                        } else {
                            throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + List.class);
                        }
                    }
                }
                try {
                    kVar = (List) hVar.b(new FileReader(file), new bb.a(new wa.g(null, List.class, typeArr)).f2156b);
                } catch (Throwable th2) {
                    kVar = new yb.k(th2);
                }
                if (yb.l.a(kVar) == null) {
                    list = kVar;
                }
                list = list;
            } else {
                throw new IllegalArgumentException(List.class.getName() + " requires " + length + " type arguments, but got 1");
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Object k10 = lVar.k(obj);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(context.getFilesDir(), str)));
        try {
            outputStreamWriter.write(hVar.e(arrayList));
            outputStreamWriter.close();
        } finally {
        }
    }

    public void y(int i2, int i10) {
        int[] iArr = (int[]) this.B;
        if (iArr != null && i2 < iArr.length) {
            int i11 = i2 + i10;
            k(i11);
            int[] iArr2 = (int[]) this.B;
            System.arraycopy(iArr2, i2, iArr2, i11, (iArr2.length - i2) - i10);
            Arrays.fill((int[]) this.B, i2, i11, -1);
            ArrayList arrayList = (ArrayList) this.L;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    p1 p1Var = (p1) ((ArrayList) this.L).get(size);
                    int i12 = p1Var.A;
                    if (i12 >= i2) {
                        p1Var.A = i12 + i10;
                    }
                }
            }
        }
    }

    public void z(int i2, int i10) {
        int[] iArr = (int[]) this.B;
        if (iArr != null && i2 < iArr.length) {
            int i11 = i2 + i10;
            k(i11);
            int[] iArr2 = (int[]) this.B;
            System.arraycopy(iArr2, i11, iArr2, i2, (iArr2.length - i2) - i10);
            int[] iArr3 = (int[]) this.B;
            Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.L;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    p1 p1Var = (p1) ((ArrayList) this.L).get(size);
                    int i12 = p1Var.A;
                    if (i12 >= i2) {
                        if (i12 < i11) {
                            ((ArrayList) this.L).remove(size);
                        } else {
                            p1Var.A = i12 - i10;
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ g(int i2, Object obj, Object obj2, boolean z10) {
        this.A = i2;
        this.L = obj;
        this.B = obj2;
    }

    public /* synthetic */ g(int i2, boolean z10) {
        this.A = i2;
    }

    public /* synthetic */ g(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    public g(o0 o0Var, v0 v0Var) {
        this.A = 2;
        this.B = o0Var;
        this.L = s.w(v0Var);
    }

    public g(q1.a0 a0Var, ai.v0 v0Var, q1.v vVar) {
        this.A = 23;
        this.B = a0Var;
        this.L = v0Var;
    }

    public g(c5.e eVar) {
        this.A = 9;
        this.L = eVar;
    }

    public g(String str, int i2) {
        this.A = i2;
        switch (i2) {
            case 25:
                this.L = new LinkedHashMap();
                this.B = str;
                return;
            default:
                this.B = (ExtraSupportedOutputSizeQuirk) z.a.f14847a.j(ExtraSupportedOutputSizeQuirk.class);
                this.L = new c(str, 0);
                return;
        }
    }

    public g(dk.a aVar) {
        this.A = 12;
        this.L = aVar;
        this.B = new short[768];
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, j7.r1] */
    public g(s0 s0Var) {
        this.A = 28;
        this.B = s0Var;
        ?? obj = new Object();
        obj.f7661a = 0;
        this.L = obj;
    }

    public g(bd.h hVar, bd.b bVar) {
        this.A = 21;
        bd.d dVar = bd.d.f2163b0;
        bd.e eVar = bd.e.f2164b0;
        this.B = hVar;
        this.L = bVar;
    }

    public g(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.A = 5;
        lowerBound = bounds.getLowerBound();
        this.B = q5.b.d(lowerBound);
        upperBound = bounds.getUpperBound();
        this.L = q5.b.d(upperBound);
    }

    public g(g2.n nVar) {
        this.A = 15;
        this.L = nVar;
        this.B = new g2.m(0, nVar);
    }

    public g(f1.g gVar) {
        this.A = 14;
        this.B = gVar;
    }
}
