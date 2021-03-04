import SwiftUI
import Shared
import CoreUi

func greet() -> String {
    return Greeting(truck:TruckImpl() as! Core_uiTruck).greeting()
}

struct ContentView: View {
    var body: some View {
        VStack {
            Text(greet())
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}

class TruckImpl: Truck {
    func getName() -> String {
        return "ios truck"
    }
}

