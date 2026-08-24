package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ji  reason: default package */
/* loaded from: classes.dex */
public final class ji extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public Object d0;
    public Object e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
        this.f0 = obj4;
        this.g0 = obj5;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:15:0x003d, B:25:0x0081, B:22:0x0070, B:27:0x008b, B:8:0x0022), top: B:42:0x000c }] */
    /* JADX WARN: Type inference failed for: r11v2, types: [gx0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [ul0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ul0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [ul0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [s35] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [s35, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [s35, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:22:0x0070). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009c -> B:22:0x0070). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object v(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.g0
            on2 r0 = (defpackage.on2) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r10.Y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L14
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L29
        L14:
            java.lang.Object r2 = r10.Z
            java.lang.Object r5 = r10.e0
            ul0 r5 = (defpackage.ul0) r5
            java.lang.Object r7 = r10.d0
            s35 r7 = (defpackage.s35) r7
            java.lang.Object r8 = r10.f0
            ne2 r8 = (defpackage.ne2) r8
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L26
            goto L70
        L26:
            r10 = move-exception
            goto La0
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r6
        L2f:
            java.lang.Object r2 = r10.Z
            java.lang.Object r5 = r10.e0
            ul0 r5 = (defpackage.ul0) r5
            java.lang.Object r7 = r10.d0
            s35 r7 = (defpackage.s35) r7
            java.lang.Object r8 = r10.f0
            ne2 r8 = (defpackage.ne2) r8
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L26
            goto L81
        L41:
            defpackage.oi2.Y(r11)
            java.lang.Object r11 = r10.f0
            r8 = r11
            ne2 r8 = (defpackage.ne2) r8
            s35 r7 = new s35
            r7.<init>()
            si6 r11 = new si6
            r11.<init>()
            r7.A = r11
            r11 = 6
            v80 r11 = defpackage.nb3.c(r5, r6, r6, r11)
            java.lang.Object r2 = r7.C(r11, r0)     // Catch: java.lang.Throwable -> L9e
            r10.f0 = r8     // Catch: java.lang.Throwable -> L9e
            r10.d0 = r7     // Catch: java.lang.Throwable -> L9e
            r10.e0 = r11     // Catch: java.lang.Throwable -> L9e
            r10.Z = r2     // Catch: java.lang.Throwable -> L9e
            r10.Y = r5     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r5 = r8.a(r2, r10)     // Catch: java.lang.Throwable -> L9e
            if (r5 != r1) goto L6f
            goto L9b
        L6f:
            r5 = r11
        L70:
            r10.f0 = r8     // Catch: java.lang.Throwable -> L26
            r10.d0 = r7     // Catch: java.lang.Throwable -> L26
            r10.e0 = r5     // Catch: java.lang.Throwable -> L26
            r10.Z = r2     // Catch: java.lang.Throwable -> L26
            r10.Y = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r5.o(r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r1) goto L81
            goto L9b
        L81:
            java.lang.Object r11 = r7.C(r5, r0)     // Catch: java.lang.Throwable -> L26
            boolean r9 = defpackage.nb3.k(r11, r2)     // Catch: java.lang.Throwable -> L26
            if (r9 != 0) goto L70
            r10.f0 = r8     // Catch: java.lang.Throwable -> L26
            r10.d0 = r7     // Catch: java.lang.Throwable -> L26
            r10.e0 = r5     // Catch: java.lang.Throwable -> L26
            r10.Z = r11     // Catch: java.lang.Throwable -> L26
            r10.Y = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r8.a(r11, r10)     // Catch: java.lang.Throwable -> L26
            if (r2 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r2 = r11
            goto L70
        L9e:
            r10 = move-exception
            r5 = r11
        La0:
            java.lang.Object r11 = r7.A
            gx0 r11 = (defpackage.gx0) r11
            if (r11 == 0) goto La9
            r11.k(r5)
        La9:
            java.lang.Object r11 = r7.A
            gx0 r11 = (defpackage.gx0) r11
            if (r11 == 0) goto Lb0
            goto Lb5
        Lb0:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.r05.b(r0)
        Lb5:
            r11.e()
            r7.A = r6
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji.v(java.lang.Object):java.lang.Object");
    }

    private final Object x(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            on1 on1Var = new on1((w61) this.Z, (c27) this.e0, (j4) this.f0, (j25) this.g0, (r41) null, 2);
            this.Y = 1;
            if (uj2.o((zy4) this.d0, on1Var, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 1:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 2:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 3:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 4:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 5:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 6:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 7:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 8:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 9:
                return ((ji) q((r41) obj2, (le2) obj)).s(jg7Var);
            case 10:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 11:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 12:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 13:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            case 14:
                return ((ji) q((r41) obj2, (ne2) obj)).s(jg7Var);
            case 15:
                return ((ji) q((r41) obj2, (w61) obj)).s(jg7Var);
            default:
                return ((ji) q((r41) obj2, (k86) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.g0;
        switch (i) {
            case 0:
                ji jiVar = new ji((rj) this.d0, (qn2) this.e0, (ki) this.f0, (et3) obj2, r41Var, 0);
                jiVar.Z = obj;
                return jiVar;
            case 1:
                return new ji((hk) this.f0, (hb5) obj2, r41Var, 1);
            case 2:
                return new ji((jk) this.f0, (lb5) obj2, r41Var, 2);
            case 3:
                return new ji((x56) this.Z, (String) this.d0, (String) this.e0, (v10) this.f0, (n00) obj2, r41Var, 3);
            case 4:
                return new ji((jt3) this.Z, (qa4) this.d0, (o37) this.e0, (p27) this.f0, (l33) obj2, r41Var, 4);
            case 5:
                return new ji((s70) this.Z, (c37) this.d0, (jt3) this.e0, (b47) this.f0, (mk4) obj2, r41Var, 5);
            case 6:
                return new ji((sz1) this.f0, (pq5) obj2, r41Var, 6);
            case 7:
                return new ji((hu1) this.Z, (sz1) this.d0, (dy1) this.e0, (c46) this.f0, (String) obj2, r41Var, 7);
            case 8:
                return new ji((dh5) this.Z, (String) this.d0, (String) this.e0, (hq2) this.f0, (f13) obj2, r41Var, 8);
            case 9:
                ji jiVar2 = new ji((uw0) this.d0, (qa4) this.e0, (rs4) this.f0, (qa4) obj2, r41Var, 9);
                jiVar2.Z = obj;
                return jiVar2;
            case 10:
                return new ji((zp3) this.f0, (List) obj2, r41Var, 10);
            case 11:
                return new ji((z23) this.Z, (pe5) this.d0, (wi6) this.e0, (k62) this.f0, (Bitmap) obj2, r41Var, 11);
            case 12:
                ji jiVar3 = new ji((if5) this.e0, (hf5) this.f0, (um) obj2, r41Var, 12);
                jiVar3.Z = obj;
                return jiVar3;
            case 13:
                return new ji((n96) this.f0, this.Z, (ga7) obj2, r41Var);
            case 14:
                ji jiVar4 = new ji((on2) obj2, r41Var);
                jiVar4.f0 = obj;
                return jiVar4;
            case 15:
                ji jiVar5 = new ji((zy4) this.d0, (c27) this.e0, (j4) this.f0, (j25) obj2, r41Var, 15);
                jiVar5.Z = obj;
                return jiVar5;
            default:
                ji jiVar6 = new ji((z87) this.e0, (m86) this.f0, (dh5) obj2, r41Var, 16);
                jiVar6.Z = obj;
                return jiVar6;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:238|(1:239)|(2:241|(2:243|(1:(14:246|247|248|249|250|(1:252)|253|255|256|257|(4:260|(3:262|263|264)(1:266)|265|258)|267|268|269)(2:275|276))(12:277|278|279|280|281|282|283|285|286|(11:290|250|(0)|253|255|256|257|(1:258)|267|268|269)|288|289))(3:297|298|299))(5:310|311|312|313|(3:315|288|289))|300|301|(2:303|(1:305))|306|(3:308|288|289)|280|281|282|283|285|286|(0)|288|289) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02af, code lost:
        if (defpackage.n96.p(r15, r22) == r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x05bb, code lost:
        r7.add(new defpackage.vb5(defpackage.yb5.RUNTIME_TERMINATION, r0.getClass().getSimpleName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x05ff, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0600, code lost:
        r1 = r7;
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x06bb, code lost:
        if (r7.b(r0, r22) == r6) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x07e8, code lost:
        if (r4 == r3) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0804, code lost:
        if (r2 == r3) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x081b, code lost:
        if (r5.a(r7, r22) == r3) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:?, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01dd, code lost:
        if (r3 == r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e4, code lost:
        if (r3 == r10) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e7, code lost:
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e8, code lost:
        if (r3 != r10) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f1, code lost:
        if (defpackage.n96.r(r15, r22) == r10) goto L88;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x044a: IF  (r5v60 ?? I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) != (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:200:0x0452, block:B:196:0x044a */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b8 A[Catch: all -> 0x043b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02e4, blocks: (B:119:0x02df, B:154:0x03b1, B:155:0x03b7, B:157:0x03bc, B:158:0x03bd, B:160:0x03c4, B:162:0x03d2, B:164:0x03d8, B:167:0x03de, B:169:0x03e2, B:170:0x03e6, B:171:0x03e9, B:172:0x03ec, B:156:0x03b8), top: B:484:0x02d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05ed A[Catch: all -> 0x04f9, TryCatch #13 {all -> 0x04f9, blocks: (B:241:0x04f2, B:285:0x05e4, B:287:0x05ed, B:288:0x05f8), top: B:506:0x04f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARN: Type inference failed for: r2v53, types: [h61, int] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:16:0x0082). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        hk hkVar;
        hb4 hb4Var;
        hb5 hb5Var;
        jk jkVar;
        hb4 hb4Var2;
        lb5 lb5Var;
        Object a;
        of5 of5Var;
        Object l;
        of6 of6Var;
        VideoRenderer renderer;
        Object g;
        Object d0;
        sb4 sb4Var;
        List list;
        Integer num;
        Integer num2;
        Object g2;
        List list2;
        List list3;
        Integer num3;
        Object g3;
        boolean z;
        Integer num4;
        Object o;
        boolean z2;
        rc3 rc3Var;
        rc3 u;
        h61 h61Var;
        tp6 tp6Var;
        hw4 hw4Var;
        hw4 hw4Var2;
        if5 if5Var;
        List D;
        Object[] objArr;
        cf5 cf5Var;
        ey0 ey0Var;
        long j;
        hb4 hb4Var3;
        x61 x61Var;
        n96 n96Var;
        Object s;
        x61 x61Var2;
        vs4 vs4Var;
        float f;
        int i;
        g96 g96Var;
        ll7 ll7Var;
        wo woVar;
        long j2;
        wo woVar2;
        float f2;
        k86 k86Var;
        ArrayList arrayList = null;
        int i2 = 2;
        int i3 = 1;
        r41 r41Var = null;
        switch (this.X) {
            case 0:
                ki kiVar = (ki) this.f0;
                rj rjVar = (rj) this.d0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                try {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        w61 w61Var = (w61) this.Z;
                        gt3 gt3Var = ht3.a;
                        View view = rjVar.A;
                        gt3Var.getClass();
                        u63 u63Var = new u63(view);
                        kt3 kt3Var = new kt3(rjVar.A, new ii((et3) this.g0), u63Var);
                        if (et6.a) {
                            hv.L(w61Var, null, null, new z(kiVar, u63Var, null, 3), 3);
                        }
                        qn2 qn2Var = (qn2) this.e0;
                        if (qn2Var != null) {
                            qn2Var.g(kt3Var);
                        }
                        kiVar.c = kt3Var;
                        this.Y = 1;
                        if (rjVar.a(kt3Var, this) == x61Var3) {
                            return x61Var3;
                        }
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    kiVar.c = null;
                    throw th;
                }
            case 1:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hb5Var = (hb5) this.e0;
                        hkVar = (hk) this.d0;
                        hb4Var = (hb4) this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hkVar = (hk) this.f0;
                    hb4 hb4Var4 = hkVar.b;
                    hb5 hb5Var2 = (hb5) this.g0;
                    this.Z = hb4Var4;
                    this.d0 = hkVar;
                    this.e0 = hb5Var2;
                    this.Y = 1;
                    if (hb4Var4.e(this) == x61Var4) {
                        return x61Var4;
                    }
                    hb4Var = hb4Var4;
                    hb5Var = hb5Var2;
                }
                try {
                    SharedPreferences.Editor edit = hkVar.a.edit();
                    edit.putString("ra_username", hb5Var.a);
                    edit.putString("ra_token", hb5Var.b);
                    edit.apply();
                    hb4Var.h(null);
                    return jg7.a;
                } finally {
                }
            case 2:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        lb5Var = (lb5) this.e0;
                        jkVar = (jk) this.d0;
                        hb4Var2 = (hb4) this.Z;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    jkVar = (jk) this.f0;
                    hb4 hb4Var5 = jkVar.b;
                    lb5 lb5Var2 = (lb5) this.g0;
                    this.Z = hb4Var5;
                    this.d0 = jkVar;
                    this.e0 = lb5Var2;
                    this.Y = 1;
                    if (hb4Var5.e(this) == x61Var5) {
                        return x61Var5;
                    }
                    hb4Var2 = hb4Var5;
                    lb5Var = lb5Var2;
                }
                try {
                    jk.a(jkVar, lb5Var);
                    hb4Var2.h(null);
                    return jg7.a;
                } finally {
                }
            case 3:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        a = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    al6 al6Var = al6.Long;
                    this.Y = 1;
                    a = ((x56) this.Z).a.a((String) this.d0, (String) this.e0, al6Var, this);
                    if (a == x61Var6) {
                        return x61Var6;
                    }
                }
                if (((ll6) a) == ll6.ActionPerformed) {
                    ((v10) this.f0).e((n00) this.g0);
                }
                return jg7.a;
            case 4:
                jt3 jt3Var = (jt3) this.Z;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                try {
                    if (i8 != 0) {
                        if (i8 == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        g21 f0 = np2.f0(new f4((qa4) this.d0, 16));
                        bm0 bm0Var = new bm0(jt3Var, (o37) this.e0, (p27) this.f0, (l33) this.g0, 1);
                        this.Y = 1;
                        if (f0.b(bm0Var, this) == x61Var7) {
                            return x61Var7;
                        }
                    }
                    hf.N(jt3Var);
                    return jg7.a;
                } catch (Throwable th2) {
                    hf.N(jt3Var);
                    throw th2;
                }
            case 5:
                jg7 jg7Var = jg7.a;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i9 = this.Y;
                if (i9 != 0) {
                    if (i9 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    s70 s70Var = (s70) this.Z;
                    d17 d17Var = ((jt3) this.e0).a;
                    a47 a47Var = ((b47) this.f0).a;
                    this.Y = 1;
                    int s2 = ((mk4) this.g0).s(k47.e(((c37) this.d0).b));
                    if (s2 < a47Var.a.a.B.length()) {
                        of5Var = a47Var.b(s2);
                    } else if (s2 != 0) {
                        of5Var = a47Var.b(s2 - 1);
                    } else {
                        of5Var = new of5(RecyclerView.B1, RecyclerView.B1, 1.0f, (int) (l17.b(d17Var.b, d17Var.g, d17Var.h) & 4294967295L));
                    }
                    Object a2 = s70Var.a(of5Var, this);
                    if (a2 != x61Var8) {
                        a2 = jg7Var;
                    }
                    if (a2 == x61Var8) {
                        return x61Var8;
                    }
                }
                return jg7Var;
            case 6:
                pq5 pq5Var = (pq5) this.g0;
                sz1 sz1Var = (sz1) this.f0;
                x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                oi2.Y(obj);
                                return jg7.a;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        of6Var = (of6) this.Z;
                        renderer = (VideoRenderer) this.e0;
                        pq5Var = (pq5) this.d0;
                        g = obj;
                        zy1 zy1Var = new zy1(pq5Var, renderer, (z33) g);
                        this.Z = null;
                        this.d0 = null;
                        this.e0 = null;
                        this.Y = 3;
                        break;
                    } else {
                        oi2.Y(obj);
                        l = obj;
                    }
                } else {
                    oi2.Y(obj);
                    kd6 kd6Var = sz1Var.c;
                    jt5 jt5Var = pq5Var.f;
                    this.Y = 1;
                    l = ((ng6) kd6Var).l(jt5Var, this);
                    break;
                }
                RendererConfiguration rendererConfiguration = ((EmulatorConfiguration) l).getRendererConfiguration();
                of6Var = sz1Var.T0;
                renderer = rendererConfiguration.getRenderer();
                this.Z = of6Var;
                this.d0 = pq5Var;
                this.e0 = renderer;
                this.Y = 2;
                g = sz1.g(sz1Var, pq5Var, this);
                break;
            case 7:
                x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        oi2.Y(obj);
                        d0 = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    la laVar = new la((sz1) this.d0, (dy1) this.e0, (c46) this.f0, (String) this.g0, null, 3);
                    this.Y = 1;
                    d0 = hv.d0(de1Var, laVar, this);
                    if (d0 == x61Var10) {
                        return x61Var10;
                    }
                }
                ((hu1) this.Z).g((List) d0);
                return jg7.a;
            case 8:
                x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                hn hnVar = new hn((dh5) this.Z, (String) this.d0, (String) this.e0, (hq2) this.f0, (f13) this.g0, (r41) null, 7);
                this.Y = 1;
                Object C = g04.C(hnVar, this);
                if (C != x61Var11) {
                    return C;
                }
                return x61Var11;
            case 9:
                rs4 rs4Var = (rs4) this.f0;
                jg7 jg7Var2 = jg7.a;
                qa4 qa4Var = (qa4) this.g0;
                uw0 uw0Var = (uw0) this.d0;
                qa4 qa4Var2 = (qa4) this.e0;
                x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                try {
                    if (i13 != 0) {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                sb4Var = (sb4) this.Z;
                                oi2.Y(obj);
                                uw0Var.e(sb4Var, false);
                                return jg7Var2;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        return jg7Var2;
                    }
                    oi2.Y(obj);
                    le2 le2Var = (le2) this.Z;
                    if (((List) qa4Var2.getValue()).size() < 2) {
                        p34 p34Var = p34.L;
                        this.Y = 1;
                        break;
                    } else {
                        rs4Var.i(RecyclerView.B1);
                        sb4 sb4Var2 = (sb4) gt0.Q0((List) qa4Var2.getValue());
                        uw0Var.g(sb4Var2);
                        uw0Var.g((sb4) ((List) qa4Var2.getValue()).get(((List) qa4Var2.getValue()).size() - 2));
                        f7 f7Var = new f7(qa4Var, rs4Var, 1);
                        this.Z = sb4Var2;
                        this.Y = 2;
                        if (le2Var.b(f7Var, this) != x61Var12) {
                            sb4Var = sb4Var2;
                            uw0Var.e(sb4Var, false);
                            return jg7Var2;
                        }
                    }
                    return x61Var12;
                } finally {
                    qa4Var.setValue(Boolean.FALSE);
                }
                qa4Var.setValue(Boolean.FALSE);
            case 10:
                List list4 = (List) this.g0;
                zp3 zp3Var = (zp3) this.f0;
                x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                int i14 = this.Y;
                try {
                    try {
                    } catch (Throwable th3) {
                        list.add(new vb5(yb5.KOTLIN_DISCARD, th3.getClass().getSimpleName()));
                        num2 = null;
                        list2 = arrayList;
                    }
                } catch (Throwable th4) {
                    arrayList.add(new vb5(yb5.NATIVE_DISCARD, th4.getClass().getSimpleName()));
                    list = arrayList;
                    num = null;
                }
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                num3 = (Integer) this.e0;
                                list2 = (Integer) this.d0;
                                list3 = (List) this.Z;
                                try {
                                    oi2.Y(obj);
                                    g3 = obj;
                                    list2 = list2;
                                    if (!((Boolean) g3).booleanValue()) {
                                        list3.add(new vb5(yb5.AUTHENTICATION_CLEAR, null));
                                    }
                                    z = ((Boolean) g3).booleanValue();
                                    num4 = list2;
                                } catch (Throwable th5) {
                                    th = th5;
                                    list3.add(new vb5(yb5.AUTHENTICATION_CLEAR, th.getClass().getSimpleName()));
                                    z = false;
                                    num4 = list2;
                                    ((dz1) zp3Var.i).c();
                                    xb5 xb5Var = new xb5(list4.size(), num4, num3);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList2 = new ArrayList();
                                    while (r1.hasNext()) {
                                    }
                                    return new zb5(xb5Var, z, arrayList2);
                                }
                                try {
                                    ((dz1) zp3Var.i).c();
                                } catch (Throwable th6) {
                                    list3.add(new vb5(yb5.SESSION_CLOSE, th6.getClass().getSimpleName()));
                                }
                                xb5 xb5Var2 = new xb5(list4.size(), num4, num3);
                                HashSet hashSet2 = new HashSet();
                                ArrayList arrayList22 = new ArrayList();
                                for (Object obj2 : list3) {
                                    if (hashSet2.add(((vb5) obj2).a)) {
                                        arrayList22.add(obj2);
                                    }
                                }
                                return new zb5(xb5Var2, z, arrayList22);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (Integer) this.d0;
                        list = (List) this.Z;
                        oi2.Y(obj);
                        g2 = obj;
                        arrayList = r5;
                        num2 = (Integer) g2;
                        list2 = arrayList;
                        ((u6) zp3Var.g).c();
                        this.Z = list;
                        this.d0 = list2;
                        this.e0 = num2;
                        this.Y = 3;
                        g3 = ((n22) zp3Var.h).g(this);
                        if (g3 != x61Var13) {
                            list3 = list;
                            num3 = num2;
                            list2 = list2;
                            if (!((Boolean) g3).booleanValue()) {
                            }
                            z = ((Boolean) g3).booleanValue();
                            num4 = list2;
                            ((dz1) zp3Var.i).c();
                            xb5 xb5Var22 = new xb5(list4.size(), num4, num3);
                            HashSet hashSet22 = new HashSet();
                            ArrayList arrayList222 = new ArrayList();
                            while (r1.hasNext()) {
                            }
                            return new zb5(xb5Var22, z, arrayList222);
                        }
                        return x61Var13;
                    }
                    List list5 = (List) this.Z;
                    oi2.Y(obj);
                    o = obj;
                    arrayList = list5;
                } else {
                    oi2.Y(obj);
                    ArrayList arrayList3 = new ArrayList();
                    try {
                        ((u6) zp3Var.d).c();
                    } catch (Throwable th7) {
                        arrayList3.add(new vb5(yb5.TERMINAL_COMMIT, th7.getClass().getSimpleName()));
                    }
                    this.Z = arrayList3;
                    this.Y = 1;
                    o = ((u12) zp3Var.e).o(list4, this);
                    arrayList = arrayList3;
                    if (o == x61Var13) {
                        return x61Var13;
                    }
                }
                list = arrayList;
                num = (Integer) o;
                if (num != null) {
                    if (num.intValue() != list4.size()) {
                        list.add(new vb5(yb5.NATIVE_DISCARD, null));
                    }
                }
                this.Z = list;
                this.d0 = num;
                this.Y = 2;
                g2 = ((wc0) zp3Var.f).g(this);
                arrayList = num;
                if (g2 == x61Var13) {
                    return x61Var13;
                }
                num2 = (Integer) g2;
                list2 = arrayList;
                ((u6) zp3Var.g).c();
                this.Z = list;
                this.d0 = list2;
                this.e0 = num2;
                this.Y = 3;
                g3 = ((n22) zp3Var.h).g(this);
                if (g3 != x61Var13) {
                }
                return x61Var13;
            case 11:
                x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                int i15 = this.Y;
                if (i15 != 0) {
                    if (i15 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                z23 z23Var = (z23) this.Z;
                ArrayList arrayList4 = ((pe5) this.d0).h;
                wi6 wi6Var = (wi6) this.e0;
                k62 k62Var = (k62) this.f0;
                if (((Bitmap) this.g0) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                re5 re5Var = new re5(z23Var, arrayList4, 0, z23Var, wi6Var, k62Var, z2);
                this.Y = 1;
                Object h = re5Var.h(z23Var, this);
                if (h != x61Var14) {
                    return h;
                }
                return x61Var14;
            case 12:
                x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                ?? r2 = this.Y;
                try {
                    if (r2 != 0) {
                        if (r2 == 1) {
                            h61Var = (h61) this.d0;
                            u = (rc3) this.Z;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        u = yh2.u(((w61) this.Z).A());
                        if5 if5Var2 = (if5) this.e0;
                        synchronized (if5Var2.c) {
                            Throwable th8 = if5Var2.e;
                            if (th8 == null) {
                                if (((ff5) if5Var2.u.getValue()).compareTo(ff5.ShuttingDown) > 0) {
                                    if (if5Var2.d == null) {
                                        if5Var2.d = u;
                                        if (if5Var2.y() != null) {
                                            tx0.a("called outside of runRecomposeAndApplyChanges");
                                        }
                                    } else {
                                        throw new IllegalStateException("Recomposer already running");
                                    }
                                } else {
                                    throw new IllegalStateException("Recomposer shut down");
                                }
                            } else {
                                throw th8;
                            }
                        }
                        z5 z5Var = new z5((if5) this.e0, 22);
                        bm6.e(bm6.a);
                        synchronized (bm6.c) {
                            bm6.h = gt0.U0(z5Var, bm6.h);
                        }
                        h61Var = new h61(z5Var, 20);
                        tp6 tp6Var2 = if5.z;
                        q61 q61Var = ((if5) this.e0).y;
                        do {
                            tp6Var = if5.z;
                            hw4Var = (hw4) tp6Var.getValue();
                            d90 d90Var = d90.t0;
                            yv4 yv4Var = hw4Var.L;
                            if (yv4Var.containsKey(q61Var)) {
                                hw4Var2 = hw4Var;
                            } else if (hw4Var.isEmpty()) {
                                hw4Var2 = new hw4(q61Var, q61Var, yv4Var.c(q61Var, new ew3(d90Var, d90Var)));
                            } else {
                                Object obj3 = hw4Var.B;
                                Object obj4 = yv4Var.get(obj3);
                                obj4.getClass();
                                hw4Var2 = new hw4(hw4Var.A, q61Var, yv4Var.c(obj3, new ew3(((ew3) obj4).a, q61Var)).c(q61Var, new ew3(obj3, d90Var)));
                            }
                            if (hw4Var != hw4Var2) {
                            }
                            if5Var = (if5) this.e0;
                            synchronized (if5Var.c) {
                                D = if5Var.D();
                            }
                            int size = D.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                for (Object obj5 : ((ey0) D.get(i16)).Y.L) {
                                    if (obj5 instanceof cf5) {
                                        cf5Var = (cf5) obj5;
                                    } else {
                                        cf5Var = null;
                                    }
                                    if (cf5Var != null && (ey0Var = cf5Var.a) != null) {
                                        ey0Var.s(cf5Var, null);
                                    }
                                }
                            }
                            u12 u12Var = new u12((hf5) this.f0, (um) this.g0, (r41) null, 24);
                            this.Z = u;
                            this.d0 = h61Var;
                            this.Y = 1;
                            if (g04.C(u12Var, this) == x61Var15) {
                                return x61Var15;
                            }
                        } while (!tp6Var.j(hw4Var, hw4Var2));
                        if5Var = (if5) this.e0;
                        synchronized (if5Var.c) {
                        }
                    }
                    h61Var.d();
                    if5 if5Var3 = (if5) this.e0;
                    synchronized (if5Var3.c) {
                        try {
                            if (if5Var3.d == u) {
                                if5Var3.d = null;
                            }
                            if (if5Var3.y() != null) {
                                tx0.a("called outside of runRecomposeAndApplyChanges");
                            }
                        } catch (Throwable th9) {
                            throw th9;
                        }
                    }
                    tp6 tp6Var3 = if5.z;
                    x31.n(((if5) this.e0).y);
                    return jg7.a;
                } catch (Throwable th10) {
                    r2.d();
                    if5 if5Var4 = (if5) this.e0;
                    synchronized (if5Var4.c) {
                        try {
                            if (if5Var4.d == rc3Var) {
                                if5Var4.d = null;
                            }
                            if (if5Var4.y() != null) {
                                tx0.a("called outside of runRecomposeAndApplyChanges");
                            }
                            tp6 tp6Var4 = if5.z;
                            x31.n(((if5) this.e0).y);
                            throw th10;
                        } catch (Throwable th11) {
                            throw th11;
                        }
                    }
                }
            case 13:
                wo woVar3 = n96.t;
                jg7 jg7Var3 = jg7.a;
                ga7 ga7Var = (ga7) this.g0;
                wo woVar4 = n96.s;
                Object obj6 = this.Z;
                n96 n96Var2 = (n96) this.f0;
                x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                int i17 = this.Y;
                try {
                    if (i17 != 0) {
                        j = Long.MIN_VALUE;
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3) {
                                    if (i17 != 4) {
                                        if (i17 == 5) {
                                            oi2.Y(obj);
                                            f2 = 0.0f;
                                            n96Var2.x(f2);
                                            return jg7Var3;
                                        }
                                        i.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    oi2.Y(obj);
                                    i = 5;
                                    x61Var2 = x61Var16;
                                    f = 0.0f;
                                    n96Var2.l(obj6);
                                    this.Y = i;
                                    if (n96.q(n96Var2, this) != x61Var2) {
                                        f2 = f;
                                        n96Var2.x(f2);
                                        return jg7Var3;
                                    }
                                    return x61Var2;
                                }
                                oi2.Y(obj);
                                x61Var = x61Var16;
                                vs4Var = n96Var2.c;
                                rs4 rs4Var2 = n96Var2.i;
                                if (!nb3.k(vs4Var.getValue(), obj6)) {
                                    if (rs4Var2.h() >= 1.0f || ((g96Var = n96Var2.o) != null && nb3.k(null, g96Var.b))) {
                                        f = 0.0f;
                                        x61Var2 = x61Var;
                                        i = 5;
                                    } else {
                                        if (g96Var != null) {
                                            ll7Var = g96Var.b;
                                        } else {
                                            ll7Var = null;
                                        }
                                        if (ll7Var != null) {
                                            x61 x61Var17 = x61Var;
                                            long j3 = g96Var.a;
                                            wo woVar5 = g96Var.e;
                                            wo woVar6 = g96Var.f;
                                            if (woVar6 == null) {
                                                woVar2 = woVar4;
                                            } else {
                                                woVar2 = woVar6;
                                            }
                                            x61Var2 = x61Var17;
                                            f = 0.0f;
                                            j2 = 0;
                                            woVar = (wo) ll7Var.h(j3, woVar5, woVar3, woVar2);
                                            i = 5;
                                        } else {
                                            woVar = woVar4;
                                            f = 0.0f;
                                            x61Var2 = x61Var;
                                            i = 5;
                                            j2 = 0;
                                            if (g96Var != null && g96Var.a != 0) {
                                                long j4 = g96Var.g;
                                                if (j4 == j) {
                                                    j4 = n96Var2.f;
                                                }
                                                float f3 = ((float) j4) / 1.0E9f;
                                                if (f3 > RecyclerView.B1) {
                                                    woVar = new wo(1.0f / f3);
                                                }
                                            }
                                        }
                                        if (g96Var == null) {
                                            g96Var = new g96();
                                        }
                                        wo woVar7 = g96Var.e;
                                        g96Var.b = null;
                                        g96Var.c = false;
                                        g96Var.d = rs4Var2.h();
                                        woVar7.e(0, rs4Var2.h());
                                        long j5 = n96Var2.f;
                                        g96Var.g = j5;
                                        g96Var.a = j2;
                                        g96Var.f = woVar;
                                        g96Var.h = u24.F((1.0d - rs4Var2.h()) * j5);
                                        n96Var2.o = g96Var;
                                    }
                                    this.d0 = null;
                                    this.e0 = null;
                                    this.Y = 4;
                                    break;
                                }
                                return jg7Var3;
                            }
                            oi2.Y(obj);
                            x61Var = x61Var16;
                            this.Y = 3;
                            break;
                        } else {
                            n96Var = (n96) this.e0;
                            hb4Var3 = (hb4) this.d0;
                            oi2.Y(obj);
                            x61Var = x61Var16;
                        }
                    } else {
                        j = Long.MIN_VALUE;
                        oi2.Y(obj);
                        Object value = n96Var2.b.getValue();
                        if (!obj6.equals(value)) {
                            n96.o(n96Var2);
                            n96Var2.x(RecyclerView.B1);
                            ga7Var.p(obj6);
                            ga7Var.n(0L);
                            n96Var2.l(value);
                            n96Var2.b.setValue(obj6);
                        }
                        hb4Var3 = n96Var2.k;
                        this.d0 = hb4Var3;
                        this.e0 = n96Var2;
                        this.Y = 1;
                        x61Var = x61Var16;
                        if (hb4Var3.e(this) != x61Var) {
                            n96Var = n96Var2;
                        }
                        x61Var2 = x61Var;
                        return x61Var2;
                    }
                    Object obj7 = n96Var.d;
                    hb4Var3.h(null);
                    if (!obj6.equals(obj7)) {
                        this.d0 = null;
                        this.e0 = null;
                        this.Y = 2;
                        if (n96Var2.m == j) {
                            s = ii2.x(b()).a(n96Var2.p, this);
                            break;
                        } else {
                            s = n96Var2.s(this);
                            break;
                        }
                        n96Var2.x(f2);
                        return jg7Var3;
                    }
                    vs4Var = n96Var2.c;
                    rs4 rs4Var22 = n96Var2.i;
                    if (!nb3.k(vs4Var.getValue(), obj6)) {
                    }
                    return jg7Var3;
                } finally {
                }
            case 14:
                return v(obj);
            case 15:
                return x(obj);
            default:
                m86 m86Var = (m86) this.f0;
                dh5 dh5Var = (dh5) this.g0;
                z87 z87Var = (z87) this.e0;
                x61 x61Var18 = x61.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        oi2.Y(obj);
                        k86 k86Var2 = (k86) this.Z;
                        dh5 dh5Var2 = (dh5) this.d0;
                        Object C2 = obj;
                        dh5Var2.A = C2;
                        x87 x87Var = (x87) dh5Var.A;
                        yc1 yc1Var = z87Var.e;
                        long j6 = x87Var.b;
                        long j7 = x87Var.a;
                        ((rl7) yc1Var.A).a(Float.intBitsToFloat((int) (j7 >> 32)), j6);
                        ((rl7) yc1Var.B).a(Float.intBitsToFloat((int) (j7 & 4294967295L)), j6);
                        x87 e = z87.e(z87Var.f);
                        if (e != null) {
                            yc1 yc1Var2 = z87Var.e;
                            long j8 = e.b;
                            long j9 = e.a;
                            ((rl7) yc1Var2.A).a(Float.intBitsToFloat((int) (j9 >> 32)), j8);
                            ((rl7) yc1Var2.B).a(Float.intBitsToFloat((int) (j9 & 4294967295L)), j8);
                            dh5Var.A = ((x87) dh5Var.A).a(e);
                        }
                        float i19 = m86Var.i(m86Var.e(((x87) dh5Var.A).a));
                        m86 m86Var2 = z87Var.a;
                        m86Var2.g(m86Var2.e(k86Var2.a(1, m86Var2.h(m86Var2.d(i19)))));
                        k86Var = k86Var2;
                        i2 = 2;
                        i3 = 1;
                        r41Var = null;
                        if (!((x87) dh5Var.A).c) {
                            v80 v80Var = z87Var.f;
                            this.Z = k86Var;
                            this.d0 = dh5Var;
                            this.Y = i3;
                            C2 = g04.C(new bf4(v80Var, r41Var, i2), this);
                            if (C2 == x61Var18) {
                                return x61Var18;
                            }
                            k86Var2 = k86Var;
                            dh5Var2 = dh5Var;
                            dh5Var2.A = C2;
                            x87 x87Var2 = (x87) dh5Var.A;
                            yc1 yc1Var3 = z87Var.e;
                            long j62 = x87Var2.b;
                            long j72 = x87Var2.a;
                            ((rl7) yc1Var3.A).a(Float.intBitsToFloat((int) (j72 >> 32)), j62);
                            ((rl7) yc1Var3.B).a(Float.intBitsToFloat((int) (j72 & 4294967295L)), j62);
                            x87 e2 = z87.e(z87Var.f);
                            if (e2 != null) {
                            }
                            float i192 = m86Var.i(m86Var.e(((x87) dh5Var.A).a));
                            m86 m86Var22 = z87Var.a;
                            m86Var22.g(m86Var22.e(k86Var2.a(1, m86Var22.h(m86Var22.d(i192)))));
                            k86Var = k86Var2;
                            i2 = 2;
                            i3 = 1;
                            r41Var = null;
                            if (!((x87) dh5Var.A).c) {
                                return jg7.a;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    k86 k86Var3 = (k86) this.Z;
                    float i20 = m86Var.i(m86Var.e(((x87) dh5Var.A).a));
                    m86 m86Var3 = z87Var.a;
                    m86Var3.g(m86Var3.e(k86Var3.a(1, m86Var3.h(m86Var3.d(i20)))));
                    k86Var = k86Var3;
                    if (!((x87) dh5Var.A).c) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(n96 n96Var, Object obj, ga7 ga7Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 13;
        this.f0 = n96Var;
        this.Z = obj;
        this.g0 = ga7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji(Object obj, Object obj2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.f0 = obj;
        this.g0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = obj;
        this.f0 = obj2;
        this.g0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji(Object obj, Object obj2, Object obj3, Object obj4, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = obj;
        this.e0 = obj2;
        this.f0 = obj3;
        this.g0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(on2 on2Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 14;
        this.g0 = on2Var;
    }
}
