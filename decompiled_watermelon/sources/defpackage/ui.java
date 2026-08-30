package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ui  reason: default package */
/* loaded from: classes.dex */
public final class ui implements yi4 {
    public final String a;
    public final ds6 b;
    public final List c;
    public final List d;
    public final od2 e;
    public final od1 f;
    public final yl g;
    public final CharSequence h;
    public final gf3 i;
    public n85 j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code restructure failed: missing block: B:184:0x03b0, code lost:
        if ((r6.b.c & 1095216660480L) != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r7 == 1) goto L438;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0871 A[LOOP:6: B:417:0x086f->B:418:0x0871, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ef  */
    /* JADX WARN: Type inference failed for: r4v3, types: [yl, android.text.TextPaint, android.graphics.Paint] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ui(java.lang.String r41, defpackage.ds6 r42, java.util.List r43, java.util.List r44, defpackage.od2 r45, defpackage.od1 r46) {
        /*
            Method dump skipped, instructions count: 2355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui.<init>(java.lang.String, ds6, java.util.List, java.util.List, od2, od1):void");
    }

    @Override // defpackage.yi4
    public final float a() {
        gf3 gf3Var = this.i;
        float f = gf3Var.e;
        TextPaint textPaint = gf3Var.b;
        if (!Float.isNaN(f)) {
            return gf3Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = gf3Var.a;
        lineInstance.setText(new ek0(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, a53.j);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new b33(i, next, 1));
            } else {
                d33 d33Var = (d33) priorityQueue.peek();
                if (d33Var != null && d33Var.B - d33Var.A < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new b33(i, next, 1));
                }
            }
            i = next;
        }
        boolean isEmpty = priorityQueue.isEmpty();
        float f2 = RecyclerView.A1;
        if (!isEmpty) {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                d33 d33Var2 = (d33) it.next();
                f2 = Layout.getDesiredWidth(gf3Var.b(), d33Var2.A, d33Var2.B, textPaint);
                while (it.hasNext()) {
                    d33 d33Var3 = (d33) it.next();
                    f2 = Math.max(f2, Layout.getDesiredWidth(gf3Var.b(), d33Var3.A, d33Var3.B, textPaint));
                }
            } else {
                vd6.b();
                return RecyclerView.A1;
            }
        }
        gf3Var.e = f2;
        return f2;
    }

    @Override // defpackage.yi4
    public final boolean b() {
        boolean z;
        n85 n85Var = this.j;
        if (n85Var != null) {
            z = n85Var.p();
        } else {
            z = false;
        }
        if (!z) {
            if (!this.k && l.n(this.b)) {
                t71 t71Var = po1.a;
                t71 t71Var2 = po1.a;
                ae6 ae6Var = (ae6) t71Var2.B;
                if (ae6Var == null) {
                    if (mo1.d()) {
                        ae6Var = t71Var2.k();
                        t71Var2.B = ae6Var;
                    } else {
                        ae6Var = se.f;
                    }
                }
                if (((Boolean) ae6Var.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.yi4
    public final float c() {
        return this.i.c();
    }
}
