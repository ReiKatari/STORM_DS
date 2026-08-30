package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: d  reason: collision with root package name */
    public static final r0 f8886d = new r0(0, 0, null, 0, 0, 0, 16777215);

    /* renamed from: a  reason: collision with root package name */
    public final j0 f8887a;

    /* renamed from: b  reason: collision with root package name */
    public final v f8888b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f8889c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(long r26, long r28, p4.j r30, long r31, int r33, long r34, int r36) {
        /*
            r25 = this;
            r0 = r36
            r1 = r0 & 1
            if (r1 == 0) goto La
            long r1 = i3.s.f6687h
            r4 = r1
            goto Lc
        La:
            r4 = r26
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            long r1 = x4.o.f14349c
            r6 = r1
            goto L16
        L14:
            r6 = r28
        L16:
            r1 = r0 & 4
            r22 = 0
            if (r1 == 0) goto L1f
            r8 = r22
            goto L21
        L1f:
            r8 = r30
        L21:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L29
            long r1 = x4.o.f14349c
            r13 = r1
            goto L2b
        L29:
            r13 = r31
        L2b:
            long r18 = i3.s.f6687h
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L35
            r1 = 0
            goto L37
        L35:
            r1 = r33
        L37:
            r2 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r2
            if (r0 == 0) goto L41
            long r2 = x4.o.f14349c
            r23 = r2
            goto L43
        L41:
            r23 = r34
        L43:
            l4.j0 r3 = new l4.j0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22)
            l4.v r0 = new l4.v
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r26 = r0
            r27 = r1
            r28 = r2
            r31 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r8
            r32 = r22
            r29 = r23
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36)
            r1 = 0
            r2 = r25
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r0.<init>(long, long, p4.j, long, int, long, int):void");
    }

    public static r0 a(r0 r0Var, long j2, long j10, p4.j jVar, p4.p pVar, long j11, long j12, w4.i iVar, int i2) {
        long j13;
        long j14;
        p4.j jVar2;
        p4.p pVar2;
        long j15;
        int i10;
        w4.a aVar;
        w4.p pVar3;
        long j16;
        a0 a0Var;
        w4.i iVar2;
        w4.o oVar;
        z zVar;
        a0 a0Var2 = g2.n0.f5287l;
        if ((i2 & 1) != 0) {
            j13 = r0Var.f8887a.f8827a.b();
        } else {
            j13 = j2;
        }
        if ((i2 & 2) != 0) {
            j14 = r0Var.f8887a.f8828b;
        } else {
            j14 = j10;
        }
        if ((i2 & 4) != 0) {
            jVar2 = r0Var.f8887a.f8829c;
        } else {
            jVar2 = jVar;
        }
        j0 j0Var = r0Var.f8887a;
        p4.h hVar = j0Var.f8830d;
        p4.i iVar3 = j0Var.f8831e;
        if ((i2 & 32) != 0) {
            pVar2 = j0Var.f8832f;
        } else {
            pVar2 = pVar;
        }
        String str = j0Var.f8833g;
        if ((i2 & 128) != 0) {
            j15 = j0Var.f8834h;
        } else {
            j15 = j11;
        }
        w4.a aVar2 = j0Var.f8835i;
        w4.p pVar4 = j0Var.f8836j;
        s4.b bVar = j0Var.f8837k;
        long j17 = j0Var.f8838l;
        w4.l lVar = j0Var.m;
        i3.m0 m0Var = j0Var.f8839n;
        k3.e eVar = j0Var.f8841p;
        if ((i2 & 32768) != 0) {
            i10 = r0Var.f8888b.f8903a;
        } else {
            i10 = 3;
        }
        int i11 = i10;
        v vVar = r0Var.f8888b;
        int i12 = vVar.f8904b;
        if ((i2 & 131072) != 0) {
            aVar = aVar2;
            pVar3 = pVar4;
            j16 = vVar.f8905c;
        } else {
            aVar = aVar2;
            pVar3 = pVar4;
            j16 = j12;
        }
        w4.q qVar = vVar.f8906d;
        if ((i2 & 524288) != 0) {
            a0Var = r0Var.f8889c;
        } else {
            a0Var = a0Var2;
        }
        if ((i2 & 1048576) != 0) {
            iVar2 = vVar.f8908f;
        } else {
            iVar2 = iVar;
        }
        int i13 = vVar.f8909g;
        int i14 = vVar.f8910h;
        w4.s sVar = vVar.f8911i;
        if (i3.s.c(j13, j0Var.f8827a.b())) {
            oVar = j0Var.f8827a;
        } else if (j13 != 16) {
            oVar = new w4.c(j13);
        } else {
            oVar = w4.n.f14148a;
        }
        y yVar = null;
        if (a0Var != null) {
            zVar = a0Var.f8778a;
        } else {
            zVar = null;
        }
        j0 j0Var2 = new j0(oVar, j14, jVar2, hVar, iVar3, pVar2, str, j15, aVar, pVar3, bVar, j17, lVar, m0Var, zVar, eVar);
        if (a0Var != null) {
            yVar = a0Var.f8779b;
        }
        return new r0(j0Var2, new v(i11, i12, j16, qVar, yVar, iVar2, i13, i14, sVar), a0Var);
    }

    public static r0 e(r0 r0Var, long j2, long j10, p4.j jVar, long j11, int i2, long j12, int i10) {
        long j13;
        long j14;
        p4.j jVar2;
        long j15;
        int i11;
        long j16;
        if ((i10 & 1) != 0) {
            j13 = i3.s.f6687h;
        } else {
            j13 = j2;
        }
        if ((i10 & 2) != 0) {
            j14 = x4.o.f14349c;
        } else {
            j14 = j10;
        }
        if ((i10 & 4) != 0) {
            jVar2 = null;
        } else {
            jVar2 = jVar;
        }
        if ((i10 & 128) != 0) {
            j15 = x4.o.f14349c;
        } else {
            j15 = j11;
        }
        long j17 = i3.s.f6687h;
        if ((32768 & i10) != 0) {
            i11 = 0;
        } else {
            i11 = i2;
        }
        if ((i10 & 131072) != 0) {
            j16 = x4.o.f14349c;
        } else {
            j16 = j12;
        }
        j0 a10 = k0.a(r0Var.f8887a, j13, null, Float.NaN, j14, jVar2, null, null, null, null, j15, null, null, null, j17, null, null, null, null);
        v a11 = w.a(r0Var.f8888b, i11, 0, j16, null, null, null, 0, 0, null);
        if (r0Var.f8887a == a10 && r0Var.f8888b == a11) {
            return r0Var;
        }
        return new r0(a10, a11);
    }

    public final long b() {
        return this.f8887a.f8827a.b();
    }

    public final boolean c(r0 r0Var) {
        if (this != r0Var) {
            if (!nc.k.a(this.f8888b, r0Var.f8888b) || !this.f8887a.a(r0Var.f8887a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final r0 d(r0 r0Var) {
        if (r0Var != null && !r0Var.equals(f8886d)) {
            return new r0(this.f8887a.c(r0Var.f8887a), this.f8888b.a(r0Var.f8888b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (nc.k.a(this.f8887a, r0Var.f8887a) && nc.k.a(this.f8888b, r0Var.f8888b) && nc.k.a(this.f8889c, r0Var.f8889c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.f8888b.hashCode() + (this.f8887a.hashCode() * 31)) * 31;
        a0 a0Var = this.f8889c;
        if (a0Var != null) {
            i2 = a0Var.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) i3.s.i(b()));
        sb2.append(", brush=");
        j0 j0Var = this.f8887a;
        sb2.append(j0Var.f8827a.c());
        sb2.append(", alpha=");
        sb2.append(j0Var.f8827a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) x4.o.d(j0Var.f8828b));
        sb2.append(", fontWeight=");
        sb2.append(j0Var.f8829c);
        sb2.append(", fontStyle=");
        sb2.append(j0Var.f8830d);
        sb2.append(", fontSynthesis=");
        sb2.append(j0Var.f8831e);
        sb2.append(", fontFamily=");
        sb2.append(j0Var.f8832f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(j0Var.f8833g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) x4.o.d(j0Var.f8834h));
        sb2.append(", baselineShift=");
        sb2.append(j0Var.f8835i);
        sb2.append(", textGeometricTransform=");
        sb2.append(j0Var.f8836j);
        sb2.append(", localeList=");
        sb2.append(j0Var.f8837k);
        sb2.append(", background=");
        sb2.append((Object) i3.s.i(j0Var.f8838l));
        sb2.append(", textDecoration=");
        sb2.append(j0Var.m);
        sb2.append(", shadow=");
        sb2.append(j0Var.f8839n);
        sb2.append(", drawStyle=");
        sb2.append(j0Var.f8841p);
        sb2.append(", textAlign=");
        v vVar = this.f8888b;
        sb2.append((Object) w4.k.a(vVar.f8903a));
        sb2.append(", textDirection=");
        sb2.append((Object) w4.m.a(vVar.f8904b));
        sb2.append(", lineHeight=");
        sb2.append((Object) x4.o.d(vVar.f8905c));
        sb2.append(", textIndent=");
        sb2.append(vVar.f8906d);
        sb2.append(", platformStyle=");
        sb2.append(this.f8889c);
        sb2.append(", lineHeightStyle=");
        sb2.append(vVar.f8908f);
        sb2.append(", lineBreak=");
        sb2.append((Object) w4.e.a(vVar.f8909g));
        sb2.append(", hyphens=");
        sb2.append((Object) w4.d.a(vVar.f8910h));
        sb2.append(", textMotion=");
        sb2.append(vVar.f8911i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(l4.j0 r4, l4.v r5) {
        /*
            r3 = this;
            l4.z r0 = r4.f8840o
            l4.y r1 = r5.f8907e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            l4.a0 r2 = new l4.a0
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.r0.<init>(l4.j0, l4.v):void");
    }

    public r0(j0 j0Var, v vVar, a0 a0Var) {
        this.f8887a = j0Var;
        this.f8888b = vVar;
        this.f8889c = a0Var;
    }
}
