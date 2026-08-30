package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qe1  reason: default package */
/* loaded from: classes.dex */
public final class qe1 extends RuntimeException {
    public final ju0 A;

    public qe1(ju0 ju0Var) {
        this.A = ju0Var;
        if (!ju0Var.b) {
            int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
            List list = ju0Var.a;
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                lu0 lu0Var = (lu0) list.get(i);
                if (!nu.Y(iArr, lu0Var.a)) {
                    if (lu0Var.a == 100) {
                        int i3 = i + 2;
                        if (i3 < size && ((lu0) list.get(i3)).a == 1000) {
                            break;
                        }
                        tq0.c1(arrayList);
                    } else {
                        arrayList.add(lu0Var);
                    }
                }
                i = i2;
            }
            int size2 = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((lu0) arrayList.get(i4)).a, "SourceFile", 1);
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
        ju0 ju0Var = this.A;
        if (ju0Var.b) {
            StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
            ip3 C = l07.C();
            List list = ju0Var.a;
            list.getClass();
            iu3 iu3Var = new iu3(list);
            int b = iu3Var.b();
            for (int i = 0; i < b; i++) {
                ((lu0) iu3Var.get(i)).getClass();
            }
            ip3 t = l07.t(C);
            t.getClass();
            iu3 iu3Var2 = new iu3(t);
            int b2 = iu3Var2.b();
            for (int i2 = 0; i2 < b2; i2++) {
                sb.append("\tat ");
                sb.append((String) iu3Var2.get(i2));
                sb.append('\n');
            }
            return sb.toString();
        }
        return "Composition stack when thrown:";
    }
}
