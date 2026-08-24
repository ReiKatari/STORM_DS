package defpackage;

import com.github.junrar.rarfile.FileHeader;
import java.util.Objects;
import java.util.function.Predicate;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cu implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ cu(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((FileHeader) obj).isEncrypted();
            default:
                return Objects.nonNull((md6) obj);
        }
    }
}
