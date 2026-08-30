package t4;

import a4.e0;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import l4.r0;
import l4.u;
import n2.s2;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements u {
    public final String A;
    public final r0 B;
    public final List L;
    public final List R;
    public final p4.d X;
    public final x4.c Y;
    public final e Z;

    /* renamed from: b0  reason: collision with root package name */
    public final CharSequence f13113b0;

    /* renamed from: c0  reason: collision with root package name */
    public final m4.f f13114c0;

    /* renamed from: d0  reason: collision with root package name */
    public c1 f13115d0;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f13116e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f13117f0;

    /* JADX WARN: Code restructure failed: missing block: B:183:0x03ae, code lost:
        if ((r6.f8888b.f8905c & 1095216660480L) != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        if (r7 == 1) goto L445;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0873 A[LOOP:6: B:423:0x0871->B:424:0x0873, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0885  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fc  */
    /* JADX WARN: Type inference failed for: r4v3, types: [t4.e, android.text.TextPaint, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r5v70, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r41, l4.r0 r42, java.util.List r43, java.util.List r44, p4.d r45, x4.c r46) {
        /*
            Method dump skipped, instructions count: 2365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.c.<init>(java.lang.String, l4.r0, java.util.List, java.util.List, p4.d, x4.c):void");
    }

    @Override // l4.u
    public final float a() {
        float f8;
        m4.f fVar = this.f13114c0;
        float f10 = fVar.f9209e;
        TextPaint textPaint = fVar.f9206b;
        if (!Float.isNaN(f10)) {
            return fVar.f9209e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = fVar.f9205a;
        lineInstance.setText(new m4.c(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, new e0(6));
        int i2 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new yb.j(Integer.valueOf(i2), Integer.valueOf(next)));
            } else {
                yb.j jVar = (yb.j) priorityQueue.peek();
                if (jVar != null && ((Number) jVar.B).intValue() - ((Number) jVar.A).intValue() < next - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new yb.j(Integer.valueOf(i2), Integer.valueOf(next)));
                }
            }
            i2 = next;
        }
        if (priorityQueue.isEmpty()) {
            f8 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                yb.j jVar2 = (yb.j) it.next();
                float desiredWidth = Layout.getDesiredWidth(fVar.b(), ((Number) jVar2.A).intValue(), ((Number) jVar2.B).intValue(), textPaint);
                while (it.hasNext()) {
                    yb.j jVar3 = (yb.j) it.next();
                    desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(fVar.b(), ((Number) jVar3.A).intValue(), ((Number) jVar3.B).intValue(), textPaint));
                }
                f8 = desiredWidth;
            } else {
                fj.j.l();
                return 0.0f;
            }
        }
        fVar.f9209e = f8;
        return f8;
    }

    @Override // l4.u
    public final boolean b() {
        boolean z10;
        c1 c1Var = this.f13115d0;
        if (c1Var != null) {
            z10 = c1Var.n();
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!this.f13116e0 && j.a(this.B)) {
                rd.k kVar = i.f13128a;
                rd.k kVar2 = i.f13128a;
                s2 s2Var = (s2) kVar2.B;
                if (s2Var == null) {
                    if (m6.i.d()) {
                        s2Var = kVar2.p();
                        kVar2.B = s2Var;
                    } else {
                        s2Var = j.f13129a;
                    }
                }
                if (((Boolean) s2Var.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // l4.u
    public final float c() {
        return this.f13114c0.c();
    }
}
