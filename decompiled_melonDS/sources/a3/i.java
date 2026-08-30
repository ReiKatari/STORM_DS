package a3;

import java.util.ArrayList;
import java.util.List;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends RuntimeException {
    public final a A;

    public i(a aVar) {
        this.A = aVar;
        if (!aVar.a()) {
            ArrayList R = d0.d.R(aVar);
            int size = R.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
            for (int i2 = 0; i2 < size; i2++) {
                stackTraceElementArr[i2] = new StackTraceElement("$$compose", "m$" + ((c) R.get(i2)).f148a, "SourceFile", 1);
            }
            setStackTrace(stackTraceElementArr);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.A;
        if (aVar.a()) {
            StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
            int i2 = 0;
            if (aVar.a()) {
                ac.b g10 = t.g();
                List list = aVar.f146a;
                list.getClass();
                vc.e eVar = new vc.e(list);
                int a10 = eVar.a();
                for (int i10 = 0; i10 < a10; i10++) {
                    ((c) eVar.get(i10)).getClass();
                }
                ac.b d4 = t.d(g10);
                d4.getClass();
                vc.e eVar2 = new vc.e(d4);
                int a11 = eVar2.a();
                while (i2 < a11) {
                    sb2.append("\tat ");
                    sb2.append((String) eVar2.get(i2));
                    sb2.append('\n');
                    i2++;
                }
            } else {
                ArrayList R = d0.d.R(aVar);
                int size = R.size();
                while (i2 < size) {
                    sb2.append("\tat $$compose.m$");
                    sb2.append(((c) R.get(i2)).f148a);
                    sb2.append("(SourceFile:1)\n");
                    i2++;
                }
            }
            return sb2.toString();
        }
        return "Composition stack when thrown:";
    }
}
