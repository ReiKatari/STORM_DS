package bi;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import j7.j1;
import me.magnum.melonds.R;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class w extends j1 {
    public l1 A;
    public final /* synthetic */ y B;

    /* renamed from: u  reason: collision with root package name */
    public final zc.u f2313u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f2314v;

    /* renamed from: w  reason: collision with root package name */
    public final TextView f2315w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f2316x;

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f2317y;

    /* renamed from: z  reason: collision with root package name */
    public ze.a f2318z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, ViewGroup viewGroup, androidx.lifecycle.s sVar, mc.l lVar) {
        super(viewGroup);
        sVar.getClass();
        this.B = yVar;
        this.f2313u = sVar;
        this.f2314v = (ImageView) viewGroup.findViewById(R.id.imageRomIcon);
        this.f2315w = (TextView) viewGroup.findViewById(R.id.textRomName);
        this.f2316x = (TextView) viewGroup.findViewById(R.id.textRomPath);
        this.f2317y = (ImageView) viewGroup.findViewById(R.id.logoPlatform);
        viewGroup.setOnClickListener(new b(lVar, this));
    }
}
