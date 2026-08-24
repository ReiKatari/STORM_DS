package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nr1  reason: default package */
/* loaded from: classes.dex */
public final class nr1 extends LruCache {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr1(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj2;
                ((String) obj).getClass();
                bArr.getClass();
                return bArr.length;
            case 1:
                String str = (String) obj;
                return ((xz3) obj2).b;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                ((String) obj).getClass();
                bitmap.getClass();
                int byteCount = bitmap.getByteCount();
                if (byteCount < 1) {
                    return 1;
                }
                return byteCount;
        }
    }
}
