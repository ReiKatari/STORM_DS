package defpackage;

import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui1  reason: default package */
/* loaded from: classes.dex */
public final class ui1 extends RuntimeException {
    public final fx0 A;

    public ui1(fx0 fx0Var) {
        this.A = fx0Var;
        if (!fx0Var.b) {
            int[] iArr = {MlKitException.CODE_SCANNER_CANCELLED, MlKitException.CODE_SCANNER_CAMERA_PERMISSION_NOT_GRANTED, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 125, -127, 126665345, MlKitException.CODE_SCANNER_UNAVAILABLE};
            List list = fx0Var.a;
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                hx0 hx0Var = (hx0) list.get(i);
                if (!fv.m0(iArr, hx0Var.a)) {
                    if (hx0Var.a == 100) {
                        int i3 = i + 2;
                        if (i3 < size && ((hx0) list.get(i3)).a == 1000) {
                            break;
                        }
                        gt0.Z0(arrayList);
                    } else {
                        arrayList.add(hx0Var);
                    }
                }
                i = i2;
            }
            int size2 = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((hx0) arrayList.get(i4)).a, "SourceFile", 1);
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
        fx0 fx0Var = this.A;
        if (fx0Var.b) {
            StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
            kw3 I = hf.I();
            List list = fx0Var.a;
            list.getClass();
            l14 l14Var = new l14(list);
            int a = l14Var.a();
            for (int i = 0; i < a; i++) {
                ((hx0) l14Var.get(i)).getClass();
            }
            kw3 A = hf.A(I);
            A.getClass();
            l14 l14Var2 = new l14(A);
            int a2 = l14Var2.a();
            for (int i2 = 0; i2 < a2; i2++) {
                sb.append("\tat ");
                sb.append((String) l14Var2.get(i2));
                sb.append('\n');
            }
            return sb.toString();
        }
        return "Composition stack when thrown:";
    }
}
