package defpackage;

import android.content.SharedPreferences;
import defpackage.sz1;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.MelonDSAndroidInterface;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.VulkanPipelineProfile;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p22  reason: default package */
/* loaded from: classes.dex */
public final class p22 extends hw6 implements eo2 {
    public Object X;
    public sz1 Y;
    public hy1 Z;
    public Object d0;
    public Object e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public /* synthetic */ Object m0;
    public final /* synthetic */ sz1 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p22(sz1 sz1Var, r41 r41Var) {
        super(2, r41Var);
        this.n0 = sz1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((p22) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        p22 p22Var = new p22(this.n0, r41Var);
        p22Var.m0 = obj;
        return p22Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:283|284|(2:286|32)|247|(1:249)(1:267)|250|(1:252)|263|(1:265)|266|19|20|21|22|(1:33)(1:26)|(1:30)|10|11) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024b, code lost:
        if (defpackage.nb3.k(r11, r13) != false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0283, code lost:
        if (r13 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ef, code lost:
        if (r3.a(r0) != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0412, code lost:
        if (r2.l(r3, r21) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04b6, code lost:
        if (r2.l(r4, r21) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x061c, code lost:
        if (r9.m(r10, r21) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0620, code lost:
        r0 = r4;
        r5 = r14;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0651, code lost:
        if (r9.l(r10, r21) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x069c, code lost:
        if (defpackage.jg7.a != r6) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x06a3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x06a4, code lost:
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x06e7, code lost:
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06ee, code lost:
        if (r3.l0.getAndSet(false) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x06f0, code lost:
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06f2, code lost:
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0702, code lost:
        r21.m0 = null;
        r21.X = r0;
        r21.Y = null;
        r21.Z = null;
        r21.d0 = null;
        r21.e0 = null;
        r21.f0 = r7;
        r21.g0 = r8;
        r21.l0 = 15;
        r3.U0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x071c, code lost:
        if (defpackage.jg7.a == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:?, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:?, code lost:
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0126: MOVE  (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:47:0x0125 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0127: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:47:0x0125 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02de A[Catch: all -> 0x02f3, TryCatch #7 {all -> 0x02f3, blocks: (B:187:0x044e, B:189:0x0456, B:191:0x0461, B:195:0x048d, B:197:0x0491, B:128:0x02d3, B:130:0x02de, B:132:0x02e3, B:134:0x02eb, B:140:0x02f9, B:142:0x02ff, B:143:0x0301, B:131:0x02e1, B:125:0x02a2), top: B:364:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e1 A[Catch: all -> 0x02f3, TryCatch #7 {all -> 0x02f3, blocks: (B:187:0x044e, B:189:0x0456, B:191:0x0461, B:195:0x048d, B:197:0x0491, B:128:0x02d3, B:130:0x02de, B:132:0x02e3, B:134:0x02eb, B:140:0x02f9, B:142:0x02ff, B:143:0x0301, B:131:0x02e1, B:125:0x02a2), top: B:364:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02eb A[Catch: all -> 0x02f3, TryCatch #7 {all -> 0x02f3, blocks: (B:187:0x044e, B:189:0x0456, B:191:0x0461, B:195:0x048d, B:197:0x0491, B:128:0x02d3, B:130:0x02de, B:132:0x02e3, B:134:0x02eb, B:140:0x02f9, B:142:0x02ff, B:143:0x0301, B:131:0x02e1, B:125:0x02a2), top: B:364:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ff A[Catch: all -> 0x02f3, TryCatch #7 {all -> 0x02f3, blocks: (B:187:0x044e, B:189:0x0456, B:191:0x0461, B:195:0x048d, B:197:0x0491, B:128:0x02d3, B:130:0x02de, B:132:0x02e3, B:134:0x02eb, B:140:0x02f9, B:142:0x02ff, B:143:0x0301, B:131:0x02e1, B:125:0x02a2), top: B:364:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0456 A[Catch: all -> 0x02f3, TryCatch #7 {all -> 0x02f3, blocks: (B:187:0x044e, B:189:0x0456, B:191:0x0461, B:195:0x048d, B:197:0x0491, B:128:0x02d3, B:130:0x02de, B:132:0x02e3, B:134:0x02eb, B:140:0x02f9, B:142:0x02ff, B:143:0x0301, B:131:0x02e1, B:125:0x02a2), top: B:364:0x02a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04d2 A[Catch: all -> 0x03a1, TRY_ENTER, TryCatch #0 {all -> 0x03a1, blocks: (B:205:0x04d2, B:207:0x04d6, B:209:0x04e0, B:213:0x04f1, B:215:0x04f5, B:217:0x04fd, B:220:0x0505, B:223:0x050f, B:155:0x0378, B:157:0x038a, B:159:0x038e, B:161:0x0396, B:167:0x03a8, B:169:0x03be, B:173:0x03ea, B:175:0x03ee, B:181:0x0422, B:183:0x0426), top: B:353:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04e0 A[Catch: all -> 0x03a1, TRY_LEAVE, TryCatch #0 {all -> 0x03a1, blocks: (B:205:0x04d2, B:207:0x04d6, B:209:0x04e0, B:213:0x04f1, B:215:0x04f5, B:217:0x04fd, B:220:0x0505, B:223:0x050f, B:155:0x0378, B:157:0x038a, B:159:0x038e, B:161:0x0396, B:167:0x03a8, B:169:0x03be, B:173:0x03ea, B:175:0x03ee, B:181:0x0422, B:183:0x0426), top: B:353:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x050f A[Catch: all -> 0x03a1, TRY_LEAVE, TryCatch #0 {all -> 0x03a1, blocks: (B:205:0x04d2, B:207:0x04d6, B:209:0x04e0, B:213:0x04f1, B:215:0x04f5, B:217:0x04fd, B:220:0x0505, B:223:0x050f, B:155:0x0378, B:157:0x038a, B:159:0x038e, B:161:0x0396, B:167:0x03a8, B:169:0x03be, B:173:0x03ea, B:175:0x03ee, B:181:0x0422, B:183:0x0426), top: B:353:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x055f A[Catch: all -> 0x0546, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x0546, blocks: (B:227:0x053a, B:235:0x055f, B:239:0x0566, B:241:0x056a, B:243:0x0572, B:260:0x0594, B:262:0x059f, B:264:0x05a3, B:266:0x05ab, B:268:0x05b5, B:277:0x05f3, B:284:0x0628), top: B:376:0x053a }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0562 A[Catch: all -> 0x06ab, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x06ab, blocks: (B:233:0x054d, B:246:0x0578, B:249:0x057f, B:255:0x058a, B:256:0x058e, B:258:0x0591, B:269:0x05d0, B:275:0x05dc, B:282:0x0624, B:237:0x0562), top: B:358:0x054d }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0566 A[Catch: all -> 0x0546, TRY_ENTER, TryCatch #14 {all -> 0x0546, blocks: (B:227:0x053a, B:235:0x055f, B:239:0x0566, B:241:0x056a, B:243:0x0572, B:260:0x0594, B:262:0x059f, B:264:0x05a3, B:266:0x05ab, B:268:0x05b5, B:277:0x05f3, B:284:0x0628), top: B:376:0x053a }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x057d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05f3 A[Catch: all -> 0x0546, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x0546, blocks: (B:227:0x053a, B:235:0x055f, B:239:0x0566, B:241:0x056a, B:243:0x0572, B:260:0x0594, B:262:0x059f, B:264:0x05a3, B:266:0x05ab, B:268:0x05b5, B:277:0x05f3, B:284:0x0628), top: B:376:0x053a }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0624 A[Catch: all -> 0x06ab, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x06ab, blocks: (B:233:0x054d, B:246:0x0578, B:249:0x057f, B:255:0x058a, B:256:0x058e, B:258:0x0591, B:269:0x05d0, B:275:0x05dc, B:282:0x0624, B:237:0x0562), top: B:358:0x054d }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x058f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217 A[Catch: all -> 0x020f, TryCatch #18 {all -> 0x020f, blocks: (B:83:0x020c, B:88:0x0217, B:90:0x0221, B:93:0x022b, B:96:0x0231, B:100:0x023a, B:103:0x0241, B:105:0x0247), top: B:383:0x020c }] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v17, types: [int] */
    /* JADX WARN: Type inference failed for: r11v20, types: [int] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61, types: [int] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v65, types: [int] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v70, types: [int] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v5, types: [fb4] */
    /* JADX WARN: Type inference failed for: r5v70, types: [fb4] */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14, types: [int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v29, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, hb4] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        sz1 sz1Var;
        Object obj2;
        int i;
        String str;
        int i2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        ?? r5;
        String str2;
        int i4;
        Object obj6;
        int i5;
        sz1 sz1Var2;
        int i6;
        int i7;
        ?? r7;
        sz1 sz1Var3;
        int i8;
        hy1 hy1Var;
        RARuntimeBridgeConfig rARuntimeBridgeConfig;
        Object b;
        sz1 sz1Var4;
        hy1 hy1Var2;
        RARuntimeBridgeConfig rARuntimeBridgeConfig2;
        int i9;
        int i10;
        Object obj7;
        hb5 hb5Var;
        boolean z;
        sz1.c cVar;
        boolean z2;
        jh jhVar;
        String str3;
        String str4;
        boolean z3;
        hy1 hy1Var3;
        kd6 kd6Var;
        yr7 yr7Var;
        kd6 kd6Var2;
        s67 s67Var;
        Object obj8;
        Object B;
        Object obj9;
        ?? r11;
        Object obj10;
        Object F;
        int i11;
        int i12;
        int i13;
        sz1 sz1Var5;
        Object obj11;
        boolean z4;
        boolean z5;
        Object obj12;
        boolean booleanValue;
        VulkanPipelineProfile vulkanPipelineProfile;
        MelonDSAndroidInterface melonDSAndroidInterface;
        VideoRenderer x;
        kd6 kd6Var3;
        Object obj13;
        String str5;
        boolean booleanValue2;
        sz1.c cVar2;
        s67 s67Var2;
        Object obj14;
        sz1.c cVar3;
        boolean z6;
        boolean z7;
        sz1 sz1Var6;
        int i14;
        int i15;
        Object P0;
        boolean z8;
        Object obj15;
        sz1 sz1Var7;
        sz1.c cVar4;
        Integer num;
        jh jhVar2;
        int i16;
        Object obj16;
        jh jhVar3;
        de5 de5Var;
        bv4 bv4Var;
        int i17;
        Object obj17;
        ?? r52;
        hy1 hy1Var4;
        sz1.c cVar5;
        nv4 nv4Var;
        sz1.c cVar6;
        Object obj18;
        boolean z9;
        boolean z10;
        Object N0;
        int i18;
        int i19;
        de5 de5Var2;
        bv4 bv4Var2;
        jf4 jf4Var;
        jh jhVar4;
        jh jhVar5;
        int i20;
        Object obj19;
        sz1 sz1Var8;
        sx1 sx1Var;
        sz1.c cVar7;
        yc5 yc5Var;
        int i21;
        boolean z11;
        q33 q33Var;
        sx1 sx1Var2;
        boolean z12;
        kd6 kd6Var4;
        jh jhVar6;
        jh jhVar7;
        Integer num2;
        de5 de5Var3;
        bv4 bv4Var3;
        de5 de5Var4;
        bv4 bv4Var4;
        sz1 sz1Var9;
        int i22;
        ArrayList arrayList;
        String str6 = "runtime_path";
        s67 s67Var3 = s67.a;
        sz1 sz1Var10 = this.n0;
        Object obj20 = (w61) this.m0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i23 = this.l0;
        try {
            try {
                try {
                    try {
                        switch (i23) {
                            case 0:
                                oi2.Y(obj);
                                try {
                                    r7 = sz1Var10.k0;
                                    this.m0 = obj20;
                                    this.X = r7;
                                    this.Y = sz1Var10;
                                    this.f0 = 0;
                                    this.g0 = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    sz1Var = sz1Var10;
                                    i = 1;
                                }
                                try {
                                    this.l0 = 1;
                                    if (r7.e(this) != x61Var) {
                                        sz1Var3 = sz1Var10;
                                        obj5 = r7;
                                        i4 = 0;
                                        i8 = 0;
                                        try {
                                            hy1Var = (hy1) sz1Var3.p0.getValue();
                                            rARuntimeBridgeConfig = sz1Var3.N;
                                            pn5 pn5Var = sz1Var3.g;
                                            this.m0 = null;
                                            this.X = obj5;
                                            this.Y = sz1Var3;
                                            this.Z = hy1Var;
                                            this.d0 = null;
                                            this.e0 = rARuntimeBridgeConfig;
                                            this.f0 = i4;
                                            this.g0 = i8;
                                            this.h0 = 0;
                                            this.i0 = 0;
                                            this.l0 = 2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sz1Var = sz1Var10;
                                            obj9 = obj5;
                                            i = 1;
                                            i5 = i4;
                                            obj6 = obj9;
                                            obj2 = null;
                                            str2 = i5;
                                            r5 = obj6;
                                            try {
                                                r5.h(obj2);
                                                throw th;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i4 = str2;
                                                if (sz1Var.j0.decrementAndGet() != 0) {
                                                }
                                                i7 = i6;
                                                if (i7 == 0) {
                                                }
                                            }
                                        }
                                        try {
                                            b = ((pl) pn5Var).c.b(this);
                                            if (b != x61Var) {
                                                sz1Var4 = sz1Var3;
                                                hy1Var2 = hy1Var;
                                                rARuntimeBridgeConfig2 = rARuntimeBridgeConfig;
                                                i9 = i8;
                                                i10 = 0;
                                                obj7 = obj5;
                                                if (!(b instanceof hb5)) {
                                                    try {
                                                        hb5Var = (hb5) b;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        sz1Var = sz1Var10;
                                                        i2 = i4;
                                                        obj4 = obj7;
                                                        i = 1;
                                                        i5 = i2;
                                                        obj6 = obj4;
                                                        obj2 = null;
                                                        str2 = i5;
                                                        r5 = obj6;
                                                        r5.h(obj2);
                                                        throw th;
                                                    }
                                                } else {
                                                    hb5Var = null;
                                                }
                                                if (rARuntimeBridgeConfig2 != null) {
                                                    String username = rARuntimeBridgeConfig2.getUsername();
                                                    String apiToken = rARuntimeBridgeConfig2.getApiToken();
                                                    if (hb5Var != null) {
                                                        str3 = hb5Var.a();
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    if (hb5Var != null) {
                                                        str4 = hb5Var.b;
                                                    } else {
                                                        str4 = null;
                                                    }
                                                    if (username != null && !qs6.v0(username) && apiToken != null && !qs6.v0(apiToken) && nb3.k(username, str3)) {
                                                        break;
                                                    }
                                                    z = false;
                                                    cVar = sz1Var4.O;
                                                    if (cVar != sz1.c.RC_CLIENT && !z) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    jhVar = sz1Var4.v;
                                                    this.m0 = null;
                                                    this.X = obj7;
                                                    this.Y = sz1Var4;
                                                    this.Z = hy1Var2;
                                                    this.d0 = null;
                                                    this.e0 = null;
                                                    this.f0 = i4;
                                                    this.g0 = i9;
                                                    this.h0 = i10;
                                                    this.i0 = z2 ? 1 : 0;
                                                    this.j0 = z;
                                                    this.l0 = 3;
                                                    jhVar.getClass();
                                                    Object j = jh.j(z2, this);
                                                    obj5 = obj7;
                                                    z3 = z2;
                                                    break;
                                                }
                                                z = true;
                                                cVar = sz1Var4.O;
                                                if (cVar != sz1.c.RC_CLIENT) {
                                                }
                                                z2 = false;
                                                jhVar = sz1Var4.v;
                                                this.m0 = null;
                                                this.X = obj7;
                                                this.Y = sz1Var4;
                                                this.Z = hy1Var2;
                                                this.d0 = null;
                                                this.e0 = null;
                                                this.f0 = i4;
                                                this.g0 = i9;
                                                this.h0 = i10;
                                                this.i0 = z2 ? 1 : 0;
                                                this.j0 = z;
                                                this.l0 = 3;
                                                jhVar.getClass();
                                                Object j2 = jh.j(z2, this);
                                                obj5 = obj7;
                                                z3 = z2;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            sz1Var = sz1Var10;
                                            obj9 = obj5;
                                            i = 1;
                                            i5 = i4;
                                            obj6 = obj9;
                                            obj2 = null;
                                            str2 = i5;
                                            r5 = obj6;
                                            r5.h(obj2);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    sz1Var = sz1Var10;
                                    i = 1;
                                    i4 = 0;
                                    if (sz1Var.j0.decrementAndGet() != 0) {
                                    }
                                    i7 = i6;
                                    if (i7 == 0) {
                                    }
                                }
                                return x61Var;
                            case 1:
                                int i24 = this.g0;
                                i4 = this.f0;
                                sz1 sz1Var11 = this.Y;
                                Object obj21 = (fb4) this.X;
                                try {
                                    oi2.Y(obj);
                                    sz1Var3 = sz1Var11;
                                    i8 = i24;
                                    obj5 = obj21;
                                    hy1Var = (hy1) sz1Var3.p0.getValue();
                                    rARuntimeBridgeConfig = sz1Var3.N;
                                    pn5 pn5Var2 = sz1Var3.g;
                                    this.m0 = null;
                                    this.X = obj5;
                                    this.Y = sz1Var3;
                                    this.Z = hy1Var;
                                    this.d0 = null;
                                    this.e0 = rARuntimeBridgeConfig;
                                    this.f0 = i4;
                                    this.g0 = i8;
                                    this.h0 = 0;
                                    this.i0 = 0;
                                    this.l0 = 2;
                                    b = ((pl) pn5Var2).c.b(this);
                                    if (b != x61Var) {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    sz1Var = sz1Var10;
                                    i = 1;
                                    if (sz1Var.j0.decrementAndGet() != 0) {
                                    }
                                    i7 = i6;
                                    if (i7 == 0) {
                                    }
                                }
                                return x61Var;
                            case 2:
                                int i25 = this.h0;
                                int i26 = this.g0;
                                int i27 = this.f0;
                                RARuntimeBridgeConfig rARuntimeBridgeConfig3 = (RARuntimeBridgeConfig) this.e0;
                                w61 w61Var = (w61) this.d0;
                                hy1 hy1Var5 = this.Z;
                                sz1 sz1Var12 = this.Y;
                                Object obj22 = (fb4) this.X;
                                try {
                                    oi2.Y(obj);
                                    sz1Var4 = sz1Var12;
                                    hy1Var2 = hy1Var5;
                                    rARuntimeBridgeConfig2 = rARuntimeBridgeConfig3;
                                    i9 = i26;
                                    i4 = i27;
                                    i10 = i25;
                                    obj7 = obj22;
                                    b = obj;
                                    if (!(b instanceof hb5)) {
                                    }
                                    if (rARuntimeBridgeConfig2 != null) {
                                    }
                                    z = true;
                                    cVar = sz1Var4.O;
                                    if (cVar != sz1.c.RC_CLIENT) {
                                    }
                                    z2 = false;
                                    jhVar = sz1Var4.v;
                                    this.m0 = null;
                                    this.X = obj7;
                                    this.Y = sz1Var4;
                                    this.Z = hy1Var2;
                                    this.d0 = null;
                                    this.e0 = null;
                                    this.f0 = i4;
                                    this.g0 = i9;
                                    this.h0 = i10;
                                    this.i0 = z2 ? 1 : 0;
                                    this.j0 = z;
                                    this.l0 = 3;
                                    jhVar.getClass();
                                    Object j22 = jh.j(z2, this);
                                    obj5 = obj7;
                                    z3 = z2;
                                    break;
                                } catch (Throwable th8) {
                                    th = th8;
                                    sz1Var = sz1Var10;
                                    i2 = i27;
                                    obj4 = obj22;
                                    i = 1;
                                    i5 = i2;
                                    obj6 = obj4;
                                    obj2 = null;
                                    str2 = i5;
                                    r5 = obj6;
                                    r5.h(obj2);
                                    throw th;
                                }
                                break;
                            case 3:
                                boolean z13 = this.j0;
                                ?? r72 = this.i0;
                                i10 = this.h0;
                                i9 = this.g0;
                                int i28 = this.f0;
                                hy1Var2 = this.Z;
                                sz1 sz1Var13 = this.Y;
                                Object obj23 = (fb4) this.X;
                                oi2.Y(obj);
                                z3 = r72;
                                i4 = i28;
                                z = z13;
                                obj5 = obj23;
                                sz1Var4 = sz1Var13;
                                hy1Var3 = hy1Var2;
                                kd6Var = sz1Var4.c;
                                if (((ng6) kd6Var).e() != VideoRenderer.VULKAN) {
                                    obj8 = "pending_total";
                                    s67Var = s67Var3;
                                    sz1Var2 = sz1Var10;
                                    obj10 = obj5;
                                    r11 = z3;
                                    try {
                                        this.m0 = null;
                                        this.X = obj10;
                                        this.Y = sz1Var4;
                                        this.Z = hy1Var3;
                                        this.d0 = null;
                                        this.f0 = i4;
                                        this.g0 = i9;
                                        this.h0 = i10;
                                        this.i0 = r11;
                                        this.j0 = z;
                                        this.l0 = 5;
                                        F = sz1.F(sz1Var4, hy1Var3, this);
                                        if (F != x61Var) {
                                            int i29 = i9;
                                            i11 = i10;
                                            i12 = r11;
                                            i13 = i29;
                                            sz1Var5 = sz1Var4;
                                            obj11 = obj10;
                                            z4 = z;
                                            try {
                                                booleanValue2 = ((Boolean) F).booleanValue();
                                                cVar2 = sz1Var5.O;
                                                if (cVar2 == sz1.c.DISABLED && !z4) {
                                                    cVar4 = sz1Var5.O;
                                                    vr4 a0 = kj2.a0("runtime_path", cVar4.getTraceValue());
                                                    nv4 nv4Var2 = sz1Var5.b0;
                                                    if (nv4Var2 != null && (de5Var = nv4Var2.i) != null && (bv4Var = (bv4) de5Var.getValue()) != null) {
                                                        num = vy7.P(bv4Var.c.a);
                                                    } else {
                                                        num = null;
                                                    }
                                                    sz1Var5.G0("ra_runtime_authentication_changed", a0, kj2.a0(obj8, num));
                                                    sz1Var5.J0.k(s67Var);
                                                    if (hy1Var3 instanceof dy1) {
                                                        jhVar3 = sz1Var5.v;
                                                        pq5 pq5Var = ((dy1) hy1Var3).a;
                                                        this.m0 = null;
                                                        this.X = obj11;
                                                        this.Y = null;
                                                        this.Z = null;
                                                        this.f0 = i4;
                                                        this.g0 = i13;
                                                        this.h0 = i11;
                                                        this.i0 = i12;
                                                        this.j0 = booleanValue2;
                                                        this.k0 = z4;
                                                        this.l0 = 6;
                                                        if (jhVar3.m(pq5Var, this) == x61Var) {
                                                        }
                                                        i16 = i4;
                                                        obj16 = obj11;
                                                    } else {
                                                        if (hy1Var3 instanceof cy1) {
                                                            jhVar2 = sz1Var5.v;
                                                            ConsoleType consoleType = ((cy1) hy1Var3).a;
                                                            this.m0 = null;
                                                            this.X = obj11;
                                                            this.Y = null;
                                                            this.Z = null;
                                                            this.f0 = i4;
                                                            this.g0 = i13;
                                                            this.h0 = i11;
                                                            this.i0 = i12;
                                                            this.j0 = booleanValue2;
                                                            this.k0 = z4;
                                                            this.l0 = 7;
                                                            break;
                                                        }
                                                        r52 = obj11;
                                                        r52.h(null);
                                                        sz1Var9 = sz1Var2;
                                                        if (sz1Var9.j0.decrementAndGet() != 0) {
                                                        }
                                                        i22 = 0;
                                                        if (i22 != 0) {
                                                        }
                                                        return jg7.a;
                                                    }
                                                    i4 = i16;
                                                    r52 = obj16;
                                                    r52.h(null);
                                                    sz1Var9 = sz1Var2;
                                                    if (sz1Var9.j0.decrementAndGet() != 0) {
                                                    }
                                                    i22 = 0;
                                                    if (i22 != 0) {
                                                    }
                                                    return jg7.a;
                                                }
                                                s67Var2 = s67Var;
                                                obj14 = obj8;
                                                cVar3 = sz1Var5.O;
                                                if (cVar3 != sz1.c.RC_CLIENT && sz1Var5.b0 != null) {
                                                    this.m0 = null;
                                                    this.X = obj11;
                                                    this.Y = sz1Var5;
                                                    this.Z = hy1Var3;
                                                    this.f0 = i4;
                                                    this.g0 = i13;
                                                    this.h0 = i11;
                                                    this.i0 = i12;
                                                    this.j0 = booleanValue2;
                                                    this.k0 = z4;
                                                    this.l0 = 8;
                                                    P0 = sz1Var5.P0(this);
                                                    if (P0 != x61Var) {
                                                        sz1 sz1Var14 = sz1Var5;
                                                        z8 = booleanValue2;
                                                        z7 = z4;
                                                        obj15 = obj11;
                                                        sz1Var7 = sz1Var14;
                                                        if (((Boolean) P0).booleanValue()) {
                                                            sz1Var7.J0.k(g77.a);
                                                            if (hy1Var3 instanceof dy1) {
                                                                jhVar5 = sz1Var7.v;
                                                                pq5 pq5Var2 = ((dy1) hy1Var3).a;
                                                                this.m0 = null;
                                                                this.X = obj15;
                                                                this.Y = null;
                                                                this.Z = null;
                                                                this.f0 = i4;
                                                                this.g0 = i13;
                                                                this.h0 = i11;
                                                                this.i0 = i12;
                                                                this.j0 = z8;
                                                                this.k0 = z7;
                                                                this.l0 = 9;
                                                                if (jhVar5.m(pq5Var2, this) == x61Var) {
                                                                }
                                                                i16 = i4;
                                                                obj16 = obj15;
                                                            } else {
                                                                r52 = obj15;
                                                                if (hy1Var3 instanceof cy1) {
                                                                    jhVar4 = sz1Var7.v;
                                                                    ConsoleType consoleType2 = ((cy1) hy1Var3).a;
                                                                    this.m0 = null;
                                                                    this.X = obj15;
                                                                    this.Y = null;
                                                                    this.Z = null;
                                                                    this.f0 = i4;
                                                                    this.g0 = i13;
                                                                    this.h0 = i11;
                                                                    this.i0 = i12;
                                                                    this.j0 = z8;
                                                                    this.k0 = z7;
                                                                    this.l0 = 10;
                                                                    break;
                                                                }
                                                                r52.h(null);
                                                                sz1Var9 = sz1Var2;
                                                                if (sz1Var9.j0.decrementAndGet() != 0) {
                                                                }
                                                                i22 = 0;
                                                                if (i22 != 0) {
                                                                }
                                                                return jg7.a;
                                                            }
                                                            i4 = i16;
                                                            r52 = obj16;
                                                            r52.h(null);
                                                            sz1Var9 = sz1Var2;
                                                            if (sz1Var9.j0.decrementAndGet() != 0) {
                                                            }
                                                            i22 = 0;
                                                            if (i22 != 0) {
                                                            }
                                                            return jg7.a;
                                                        }
                                                        Object obj24 = obj15;
                                                        z6 = z8;
                                                        i14 = i13;
                                                        i15 = i11;
                                                        sz1Var6 = sz1Var7;
                                                        obj11 = obj24;
                                                        hy1Var4 = hy1Var3;
                                                        cVar5 = sz1Var6.O;
                                                        if (cVar5 == sz1.c.RC_CLIENT) {
                                                            jf4Var = sz1Var6.o;
                                                            if (jf4Var.a()) {
                                                            }
                                                        }
                                                        nv4Var = sz1Var6.b0;
                                                        cVar6 = sz1Var6.O;
                                                        obj18 = "runtime_path";
                                                        if (cVar6 == sz1.c.DISABLED) {
                                                        }
                                                        if (nv4Var != null) {
                                                        }
                                                    }
                                                } else {
                                                    boolean z14 = z4;
                                                    z6 = booleanValue2;
                                                    z7 = z14;
                                                    int i30 = i11;
                                                    sz1Var6 = sz1Var5;
                                                    i14 = i13;
                                                    i15 = i30;
                                                    hy1Var4 = hy1Var3;
                                                    cVar5 = sz1Var6.O;
                                                    if (cVar5 == sz1.c.RC_CLIENT && sz1Var6.b0 != null) {
                                                        jf4Var = sz1Var6.o;
                                                        if (jf4Var.a()) {
                                                            sz1Var6.R0();
                                                        }
                                                    }
                                                    nv4Var = sz1Var6.b0;
                                                    cVar6 = sz1Var6.O;
                                                    obj18 = "runtime_path";
                                                    if (cVar6 == sz1.c.DISABLED) {
                                                        if (nv4Var != null && (de5Var2 = nv4Var.i) != null && (bv4Var2 = (bv4) de5Var2.getValue()) != null) {
                                                            i19 = bv4Var2.c.a;
                                                        } else {
                                                            i19 = 0;
                                                        }
                                                        if (i19 > 0) {
                                                            sz1Var6.J0.k(s67Var2);
                                                            r52 = obj11;
                                                            r52.h(null);
                                                            sz1Var9 = sz1Var2;
                                                            if (sz1Var9.j0.decrementAndGet() != 0) {
                                                            }
                                                            i22 = 0;
                                                            if (i22 != 0) {
                                                                this.m0 = null;
                                                                this.X = null;
                                                                this.Y = null;
                                                                this.Z = null;
                                                                this.d0 = null;
                                                                this.e0 = null;
                                                                this.f0 = 1;
                                                                this.g0 = i22;
                                                                this.l0 = 14;
                                                                sz1Var9.U0();
                                                            }
                                                            return jg7.a;
                                                        }
                                                    }
                                                    if (nv4Var != null) {
                                                        gd5 f = nv4Var.f();
                                                        this.m0 = null;
                                                        this.X = obj11;
                                                        this.Y = sz1Var6;
                                                        this.Z = hy1Var4;
                                                        this.d0 = nv4Var;
                                                        this.e0 = null;
                                                        this.f0 = i4;
                                                        this.g0 = i14;
                                                        this.h0 = i15;
                                                        this.i0 = i12;
                                                        this.j0 = z6;
                                                        this.k0 = z7;
                                                        this.l0 = 11;
                                                        N0 = sz1Var6.N0(f, this);
                                                        if (N0 != x61Var) {
                                                            i3 = i4;
                                                            i18 = i12;
                                                            try {
                                                                i12 = i18;
                                                                z9 = z6;
                                                                z10 = ((Boolean) N0).booleanValue();
                                                                int i31 = i14;
                                                                sz1Var8 = sz1Var6;
                                                                try {
                                                                    sx1Var = sz1Var8.w;
                                                                    boolean c = sx1Var.c();
                                                                    cVar7 = sz1Var8.O;
                                                                    boolean z15 = z10;
                                                                    if (cVar7 == sz1.c.RC_CLIENT) {
                                                                        yc5Var = yc5.RC_CLIENT;
                                                                    } else {
                                                                        yc5Var = yc5.NONE;
                                                                    }
                                                                    if (nv4Var == null && (de5Var4 = nv4Var.i) != null && (bv4Var4 = (bv4) de5Var4.getValue()) != null) {
                                                                        i21 = bv4Var4.c.a;
                                                                    } else {
                                                                        i21 = 0;
                                                                    }
                                                                    yc5Var.getClass();
                                                                    if (z9 && c && yc5Var == yc5.RC_CLIENT && i21 > 0 && z15) {
                                                                        z11 = true;
                                                                    } else {
                                                                        z11 = false;
                                                                    }
                                                                    q33Var = sz1Var8.g0;
                                                                    synchronized (q33Var) {
                                                                        try {
                                                                            q33Var.A = z11;
                                                                        } finally {
                                                                            th = th;
                                                                            sz1Var = sz1Var2;
                                                                            i = 1;
                                                                            while (true) {
                                                                                try {
                                                                                    try {
                                                                                    } catch (Throwable th9) {
                                                                                        th = th9;
                                                                                        obj6 = obj11;
                                                                                        i5 = i3;
                                                                                        obj2 = null;
                                                                                        str2 = i5;
                                                                                        r5 = obj6;
                                                                                        r5.h(obj2);
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (z11) {
                                                                        sz1Var8.J0.k(s67Var2);
                                                                        nv4 nv4Var3 = sz1Var8.b0;
                                                                        if (nv4Var3 != null && (de5Var3 = nv4Var3.i) != null && (bv4Var3 = (bv4) de5Var3.getValue()) != null) {
                                                                            num2 = vy7.P(bv4Var3.c.a);
                                                                        } else {
                                                                            num2 = null;
                                                                        }
                                                                        sz1Var8.G0("ra_pending_settings_disable_deferred", kj2.a0(obj14, num2), kj2.a0(obj18, "rc_client"), kj2.a0("hardcore", Boolean.TRUE));
                                                                    }
                                                                    sx1Var2 = sz1Var8.w;
                                                                    try {
                                                                        if (!z9 && !z11) {
                                                                            z12 = false;
                                                                            kd6Var4 = sz1Var8.c;
                                                                            ArrayList f2 = sx1Var2.f(z12, ((ng6) kd6Var4).b.getBoolean("ra_hardcore_enabled", false));
                                                                            if (!(hy1Var4 instanceof dy1)) {
                                                                                jhVar7 = sz1Var8.v;
                                                                                pq5 pq5Var3 = ((dy1) hy1Var4).a;
                                                                                this.m0 = null;
                                                                                this.X = obj11;
                                                                                this.Y = sz1Var8;
                                                                                this.Z = null;
                                                                                this.d0 = null;
                                                                                this.e0 = f2;
                                                                                this.f0 = i3;
                                                                                this.g0 = i31;
                                                                                this.h0 = i15;
                                                                                this.i0 = i12;
                                                                                this.j0 = z9;
                                                                                this.k0 = z11;
                                                                                this.l0 = 12;
                                                                                break;
                                                                            } else if (hy1Var4 instanceof cy1) {
                                                                                jhVar6 = sz1Var8.v;
                                                                                ConsoleType consoleType3 = ((cy1) hy1Var4).a;
                                                                                this.m0 = null;
                                                                                this.X = obj11;
                                                                                this.Y = sz1Var8;
                                                                                this.Z = null;
                                                                                this.d0 = null;
                                                                                this.e0 = f2;
                                                                                this.f0 = i3;
                                                                                this.g0 = i31;
                                                                                this.h0 = i15;
                                                                                this.i0 = i12;
                                                                                this.j0 = z9;
                                                                                this.k0 = z11;
                                                                                this.l0 = 13;
                                                                                break;
                                                                            } else {
                                                                                obj5 = obj11;
                                                                                i3 = i3;
                                                                                sz1.l(sz1Var8, f2);
                                                                                i16 = i3;
                                                                                obj16 = obj5;
                                                                                i4 = i16;
                                                                                r52 = obj16;
                                                                                r52.h(null);
                                                                                sz1Var9 = sz1Var2;
                                                                                if (sz1Var9.j0.decrementAndGet() != 0) {
                                                                                }
                                                                                i22 = 0;
                                                                                if (i22 != 0) {
                                                                                }
                                                                                return jg7.a;
                                                                            }
                                                                            f2 = r0;
                                                                            i3 = r2;
                                                                            obj5 = r5;
                                                                            sz1.l(sz1Var8, f2);
                                                                            i16 = i3;
                                                                            obj16 = obj5;
                                                                            i4 = i16;
                                                                            r52 = obj16;
                                                                            r52.h(null);
                                                                            sz1Var9 = sz1Var2;
                                                                            if (sz1Var9.j0.decrementAndGet() != 0) {
                                                                            }
                                                                            i22 = 0;
                                                                            if (i22 != 0) {
                                                                            }
                                                                            return jg7.a;
                                                                        }
                                                                        sz1.l(sz1Var8, f2);
                                                                        i16 = i3;
                                                                        obj16 = obj5;
                                                                        i4 = i16;
                                                                        r52 = obj16;
                                                                        r52.h(null);
                                                                        sz1Var9 = sz1Var2;
                                                                        if (sz1Var9.j0.decrementAndGet() != 0) {
                                                                        }
                                                                        i22 = 0;
                                                                        if (i22 != 0) {
                                                                        }
                                                                        return jg7.a;
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        sz1Var = sz1Var2;
                                                                        i2 = i3;
                                                                        obj4 = obj5;
                                                                        i = 1;
                                                                        i5 = i2;
                                                                        obj6 = obj4;
                                                                        obj2 = null;
                                                                        str2 = i5;
                                                                        r5 = obj6;
                                                                        r5.h(obj2);
                                                                        throw th;
                                                                    }
                                                                    z12 = true;
                                                                    kd6Var4 = sz1Var8.c;
                                                                    ArrayList f22 = sx1Var2.f(z12, ((ng6) kd6Var4).b.getBoolean("ra_hardcore_enabled", false));
                                                                    if (!(hy1Var4 instanceof dy1)) {
                                                                    }
                                                                    f22 = r0;
                                                                    i3 = r2;
                                                                    obj5 = r5;
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                }
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                obj5 = obj11;
                                                                sz1Var = sz1Var2;
                                                                i2 = i3;
                                                                obj4 = obj5;
                                                                i = 1;
                                                                i5 = i2;
                                                                obj6 = obj4;
                                                                obj2 = null;
                                                                str2 = i5;
                                                                r5 = obj6;
                                                                r5.h(obj2);
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        i3 = i4;
                                                        z9 = z6;
                                                        z10 = true;
                                                        int i312 = i14;
                                                        sz1Var8 = sz1Var6;
                                                        sx1Var = sz1Var8.w;
                                                        boolean c2 = sx1Var.c();
                                                        cVar7 = sz1Var8.O;
                                                        boolean z152 = z10;
                                                        if (cVar7 == sz1.c.RC_CLIENT) {
                                                        }
                                                        if (nv4Var == null) {
                                                        }
                                                        i21 = 0;
                                                        yc5Var.getClass();
                                                        if (z9) {
                                                        }
                                                        z11 = false;
                                                        q33Var = sz1Var8.g0;
                                                        synchronized (q33Var) {
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                sz1Var = sz1Var2;
                                                i = 1;
                                                i3 = i4;
                                                obj6 = obj11;
                                                i5 = i3;
                                                obj2 = null;
                                                str2 = i5;
                                                r5 = obj6;
                                                r5.h(obj2);
                                                throw th;
                                            }
                                        }
                                        return x61Var;
                                    } catch (Throwable th15) {
                                        th = th15;
                                        sz1Var = sz1Var2;
                                        obj9 = obj10;
                                        i = 1;
                                        i5 = i4;
                                        obj6 = obj9;
                                        obj2 = null;
                                        str2 = i5;
                                        r5 = obj6;
                                        r5.h(obj2);
                                        throw th;
                                    }
                                }
                                try {
                                    yr7Var = VulkanPipelineProfile.Companion;
                                    kd6Var2 = sz1Var4.c;
                                    ng6 ng6Var = (ng6) kd6Var2;
                                    ng6Var.getClass();
                                    sz1Var2 = sz1Var10;
                                    try {
                                        s67Var = s67Var3;
                                        obj8 = "pending_total";
                                        wp0 p = ng6Var.p("video_vulkan_fastpath_enabled", new tf6(ng6Var, 18));
                                        this.m0 = null;
                                        this.X = obj5;
                                        this.Y = sz1Var4;
                                        this.Z = hy1Var3;
                                        this.d0 = yr7Var;
                                        this.f0 = i4;
                                        this.g0 = i9;
                                        this.h0 = i10;
                                        this.i0 = z3 ? 1 : 0;
                                        this.j0 = z;
                                        this.l0 = 4;
                                        B = f04.B(p, this);
                                        obj12 = obj5;
                                        z5 = z3;
                                        if (B == x61Var) {
                                            return x61Var;
                                        }
                                        booleanValue = ((Boolean) B).booleanValue();
                                        yr7Var.getClass();
                                        if (!booleanValue) {
                                            vulkanPipelineProfile = VulkanPipelineProfile.FASTPATH;
                                        } else {
                                            vulkanPipelineProfile = VulkanPipelineProfile.COMPATIBILITY;
                                        }
                                        melonDSAndroidInterface = MelonDSAndroidInterface.a;
                                        if (melonDSAndroidInterface.c()) {
                                            obj10 = obj12;
                                            r11 = z5;
                                            break;
                                        }
                                        x = sz1.x(sz1Var4);
                                        if (x == null) {
                                            x = VideoRenderer.SOFTWARE;
                                        }
                                        kd6Var3 = sz1Var4.c;
                                        ng6 ng6Var2 = (ng6) kd6Var3;
                                        ng6Var2.getClass();
                                        x.getClass();
                                        SharedPreferences.Editor edit = ng6Var2.b.edit();
                                        String lowerCase = x.name().toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        edit.putString("video_renderer", lowerCase);
                                        edit.apply();
                                        sz1Var4.J0.k(new m77(VideoRenderer.VULKAN));
                                        r52 = obj12;
                                        r52.h(null);
                                        sz1Var9 = sz1Var2;
                                        if (sz1Var9.j0.decrementAndGet() != 0 && sz1Var9.l0.getAndSet(false)) {
                                            i22 = 1;
                                        } else {
                                            i22 = 0;
                                        }
                                        if (i22 != 0 && yh2.z(b())) {
                                            this.m0 = null;
                                            this.X = null;
                                            this.Y = null;
                                            this.Z = null;
                                            this.d0 = null;
                                            this.e0 = null;
                                            this.f0 = 1;
                                            this.g0 = i22;
                                            this.l0 = 14;
                                            sz1Var9.U0();
                                            break;
                                        }
                                        return jg7.a;
                                    } catch (Throwable th16) {
                                        th = th16;
                                        i3 = i4;
                                        sz1Var = sz1Var2;
                                        i2 = i3;
                                        obj4 = obj5;
                                        i = 1;
                                        i5 = i2;
                                        obj6 = obj4;
                                        obj2 = null;
                                        str2 = i5;
                                        r5 = obj6;
                                        r5.h(obj2);
                                        throw th;
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    sz1Var2 = sz1Var10;
                                }
                                break;
                            case 4:
                                boolean z16 = this.j0;
                                ?? r73 = this.i0;
                                i10 = this.h0;
                                i9 = this.g0;
                                ?? r112 = this.f0;
                                yr7Var = (yr7) this.d0;
                                hy1Var3 = this.Z;
                                sz1Var4 = this.Y;
                                obj13 = (fb4) this.X;
                                try {
                                    oi2.Y(obj);
                                    z5 = r73;
                                    i4 = r112;
                                    obj8 = "pending_total";
                                    s67Var = s67Var3;
                                    sz1Var2 = sz1Var10;
                                    z = z16;
                                    obj12 = obj13;
                                    B = obj;
                                    booleanValue = ((Boolean) B).booleanValue();
                                    yr7Var.getClass();
                                    if (!booleanValue) {
                                    }
                                    melonDSAndroidInterface = MelonDSAndroidInterface.a;
                                    if (melonDSAndroidInterface.c()) {
                                    }
                                    x = sz1.x(sz1Var4);
                                    if (x == null) {
                                    }
                                    kd6Var3 = sz1Var4.c;
                                    ng6 ng6Var22 = (ng6) kd6Var3;
                                    ng6Var22.getClass();
                                    x.getClass();
                                    SharedPreferences.Editor edit2 = ng6Var22.b.edit();
                                    String lowerCase2 = x.name().toLowerCase(Locale.ROOT);
                                    lowerCase2.getClass();
                                    edit2.putString("video_renderer", lowerCase2);
                                    edit2.apply();
                                    sz1Var4.J0.k(new m77(VideoRenderer.VULKAN));
                                    r52 = obj12;
                                    r52.h(null);
                                    sz1Var9 = sz1Var2;
                                    if (sz1Var9.j0.decrementAndGet() != 0) {
                                    }
                                    i22 = 0;
                                    if (i22 != 0) {
                                    }
                                    return jg7.a;
                                } catch (Throwable th18) {
                                    th = th18;
                                    sz1Var = sz1Var10;
                                    str5 = r112;
                                    obj4 = obj13;
                                    i2 = str5;
                                    i = 1;
                                    i5 = i2;
                                    obj6 = obj4;
                                    obj2 = null;
                                    str2 = i5;
                                    r5 = obj6;
                                    r5.h(obj2);
                                    throw th;
                                }
                            case 5:
                                z4 = this.j0;
                                int i32 = this.i0;
                                int i33 = this.h0;
                                int i34 = this.g0;
                                int i35 = this.f0;
                                hy1 hy1Var6 = this.Z;
                                sz1 sz1Var15 = this.Y;
                                obj11 = (fb4) this.X;
                                oi2.Y(obj);
                                i12 = i32;
                                i4 = i35;
                                i13 = i34;
                                i11 = i33;
                                obj8 = "pending_total";
                                s67Var = s67Var3;
                                sz1Var2 = sz1Var10;
                                sz1Var5 = sz1Var15;
                                F = obj;
                                hy1Var3 = hy1Var6;
                                booleanValue2 = ((Boolean) F).booleanValue();
                                cVar2 = sz1Var5.O;
                                if (cVar2 == sz1.c.DISABLED) {
                                }
                                s67Var2 = s67Var;
                                obj14 = obj8;
                                cVar3 = sz1Var5.O;
                                if (cVar3 != sz1.c.RC_CLIENT) {
                                    break;
                                }
                                boolean z142 = z4;
                                z6 = booleanValue2;
                                z7 = z142;
                                int i302 = i11;
                                sz1Var6 = sz1Var5;
                                i14 = i13;
                                i15 = i302;
                                hy1Var4 = hy1Var3;
                                cVar5 = sz1Var6.O;
                                if (cVar5 == sz1.c.RC_CLIENT) {
                                }
                                nv4Var = sz1Var6.b0;
                                cVar6 = sz1Var6.O;
                                obj18 = "runtime_path";
                                if (cVar6 == sz1.c.DISABLED) {
                                }
                                if (nv4Var != null) {
                                }
                                break;
                            case 6:
                                i17 = this.f0;
                                hy1 hy1Var7 = (hy1) this.Y;
                                Object obj25 = (fb4) this.X;
                                oi2.Y(obj);
                                obj17 = obj25;
                                sz1Var2 = sz1Var10;
                                i16 = i17;
                                obj16 = obj17;
                                i4 = i16;
                                r52 = obj16;
                                r52.h(null);
                                sz1Var9 = sz1Var2;
                                if (sz1Var9.j0.decrementAndGet() != 0) {
                                }
                                i22 = 0;
                                if (i22 != 0) {
                                }
                                return jg7.a;
                            case 7:
                                i17 = this.f0;
                                hy1 hy1Var8 = (hy1) this.Y;
                                Object obj26 = (fb4) this.X;
                                oi2.Y(obj);
                                obj17 = obj26;
                                sz1Var2 = sz1Var10;
                                i16 = i17;
                                obj16 = obj17;
                                i4 = i16;
                                r52 = obj16;
                                r52.h(null);
                                sz1Var9 = sz1Var2;
                                if (sz1Var9.j0.decrementAndGet() != 0) {
                                }
                                i22 = 0;
                                if (i22 != 0) {
                                }
                                return jg7.a;
                            case 8:
                                boolean z17 = this.k0;
                                boolean z18 = this.j0;
                                i12 = this.i0;
                                i11 = this.h0;
                                i13 = this.g0;
                                ?? r12 = this.f0;
                                hy1Var3 = this.Z;
                                sz1Var7 = this.Y;
                                obj13 = (fb4) this.X;
                                try {
                                    oi2.Y(obj);
                                    P0 = obj;
                                    sz1Var2 = sz1Var10;
                                    s67Var2 = s67Var3;
                                    z8 = z18;
                                    i4 = r12;
                                    obj14 = "pending_total";
                                    z7 = z17;
                                    obj15 = obj13;
                                    if (((Boolean) P0).booleanValue()) {
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                    sz1Var = sz1Var10;
                                    str5 = r12;
                                    obj4 = obj13;
                                    i2 = str5;
                                    i = 1;
                                    i5 = i2;
                                    obj6 = obj4;
                                    obj2 = null;
                                    str2 = i5;
                                    r5 = obj6;
                                    r5.h(obj2);
                                    throw th;
                                }
                                break;
                            case 9:
                                i20 = this.f0;
                                hy1 hy1Var9 = (hy1) this.Y;
                                Object obj27 = (fb4) this.X;
                                oi2.Y(obj);
                                obj19 = obj27;
                                sz1Var2 = sz1Var10;
                                i16 = i20;
                                obj16 = obj19;
                                i4 = i16;
                                r52 = obj16;
                                r52.h(null);
                                sz1Var9 = sz1Var2;
                                if (sz1Var9.j0.decrementAndGet() != 0) {
                                }
                                i22 = 0;
                                if (i22 != 0) {
                                }
                                return jg7.a;
                            case 10:
                                i20 = this.f0;
                                hy1 hy1Var10 = (hy1) this.Y;
                                Object obj28 = (fb4) this.X;
                                oi2.Y(obj);
                                obj19 = obj28;
                                sz1Var2 = sz1Var10;
                                i16 = i20;
                                obj16 = obj19;
                                i4 = i16;
                                r52 = obj16;
                                r52.h(null);
                                sz1Var9 = sz1Var2;
                                if (sz1Var9.j0.decrementAndGet() != 0) {
                                }
                                i22 = 0;
                                if (i22 != 0) {
                                }
                                return jg7.a;
                            case 11:
                                z6 = this.j0;
                                i18 = this.i0;
                                i15 = this.h0;
                                int i36 = this.g0;
                                int i37 = this.f0;
                                nv4 nv4Var4 = (nv4) this.e0;
                                nv4 nv4Var5 = (nv4) this.d0;
                                hy1Var4 = this.Z;
                                sz1Var6 = this.Y;
                                Object obj29 = (fb4) this.X;
                                try {
                                    oi2.Y(obj);
                                    obj18 = "runtime_path";
                                    sz1Var2 = sz1Var10;
                                    i3 = i37;
                                    nv4Var = nv4Var5;
                                    s67Var2 = s67Var3;
                                    obj11 = obj29;
                                    i14 = i36;
                                    obj14 = "pending_total";
                                    N0 = obj;
                                    i12 = i18;
                                    z9 = z6;
                                    z10 = ((Boolean) N0).booleanValue();
                                    int i3122 = i14;
                                    sz1Var8 = sz1Var6;
                                    sx1Var = sz1Var8.w;
                                    boolean c22 = sx1Var.c();
                                    cVar7 = sz1Var8.O;
                                    boolean z1522 = z10;
                                    if (cVar7 == sz1.c.RC_CLIENT) {
                                    }
                                    if (nv4Var == null) {
                                    }
                                    i21 = 0;
                                    yc5Var.getClass();
                                    if (z9) {
                                    }
                                    z11 = false;
                                    q33Var = sz1Var8.g0;
                                    synchronized (q33Var) {
                                    }
                                } catch (Throwable th20) {
                                    th = th20;
                                    sz1Var = sz1Var10;
                                    obj4 = obj29;
                                    i2 = i37;
                                    i = 1;
                                    i5 = i2;
                                    obj6 = obj4;
                                    obj2 = null;
                                    str2 = i5;
                                    r5 = obj6;
                                    r5.h(obj2);
                                    throw th;
                                }
                                break;
                            case 12:
                                ?? r2 = this.f0;
                                ?? r0 = (List) this.e0;
                                nv4 nv4Var6 = (nv4) this.d0;
                                sz1Var8 = this.Y;
                                Object obj30 = (fb4) this.X;
                                oi2.Y(obj);
                                arrayList = r0;
                                str6 = r2;
                                obj20 = obj30;
                                sz1Var2 = sz1Var10;
                                ArrayList arrayList2 = arrayList;
                                String str7 = str6;
                                Object obj31 = obj20;
                                f22 = arrayList2;
                                i3 = str7;
                                obj5 = obj31;
                                sz1.l(sz1Var8, f22);
                                i16 = i3;
                                obj16 = obj5;
                                i4 = i16;
                                r52 = obj16;
                                r52.h(null);
                                sz1Var9 = sz1Var2;
                                if (sz1Var9.j0.decrementAndGet() != 0) {
                                }
                                i22 = 0;
                                if (i22 != 0) {
                                }
                                return jg7.a;
                            case 13:
                                ?? r22 = this.f0;
                                ?? r02 = (List) this.e0;
                                nv4 nv4Var7 = (nv4) this.d0;
                                sz1Var8 = this.Y;
                                Object obj32 = (fb4) this.X;
                                oi2.Y(obj);
                                arrayList = r02;
                                str6 = r22;
                                obj20 = obj32;
                                sz1Var2 = sz1Var10;
                                ArrayList arrayList22 = arrayList;
                                String str72 = str6;
                                Object obj312 = obj20;
                                f22 = arrayList22;
                                i3 = str72;
                                obj5 = obj312;
                                sz1.l(sz1Var8, f22);
                                i16 = i3;
                                obj16 = obj5;
                                i4 = i16;
                                r52 = obj16;
                                r52.h(null);
                                sz1Var9 = sz1Var2;
                                if (sz1Var9.j0.decrementAndGet() != 0) {
                                }
                                i22 = 0;
                                if (i22 != 0) {
                                }
                                return jg7.a;
                            case 14:
                                oi2.Y(obj);
                                return jg7.a;
                            case 15:
                                Throwable th21 = (Throwable) this.X;
                                oi2.Y(obj);
                                throw th21;
                            default:
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        i3 = i23;
                    }
                } catch (Throwable th23) {
                    th = th23;
                    sz1Var = sz1Var10;
                    i2 = str;
                    obj4 = obj3;
                }
            } catch (Throwable th24) {
                th = th24;
                sz1Var = sz1Var10;
                obj2 = null;
                i = 1;
                str2 = str6;
                r5 = obj20;
                r5.h(obj2);
                throw th;
            }
        } catch (Throwable th25) {
            th = th25;
            sz1Var = sz1Var10;
            i2 = str6;
            obj4 = obj20;
        }
    }
}
