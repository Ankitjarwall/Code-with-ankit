// The following need to be installed
// expo install expo-print
// expo install expo-sharing

import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button, TextInput } from 'react-native';
import { useState } from 'react';
import { printToFileAsync } from 'expo-print';
import { shareAsync } from 'expo-sharing';

export default function App() {
  let [name, setName] = useState("Ankit");
  let [price, setPrice] = useState("40");

  const html = `
    <html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   <style>
        body {
            margin: 0;
            padding: 0;
            padding-left: 50px;
            padding-top: 50px;
        }

        .main-div {
            background: #ffffff;
            width: 800px;
            height: 400px;
            border-radius: 20px;
            display: flex;
            justify-content: space-between;
            overflow: hidden;
        }

        img {
            margin: 10px;
            width: 150px;
            height: 100px;
        }

        .event-name {
            background-color: #EC4989;
            width: 200%;
            height: 45px;
            margin-left: 30%;
            margin-top: 100px;
            color: #ffffff;
            font-size: xx-large;
            text-align: center;
            padding-top: 10px;
        }

        .text-color {
            color: #EC4989;
        }

        .agree {
            margin-top: 285px;
            margin-left: -160px;
        }

        .side-details {
            background-color: #2B2525;
            color: #fff;
            width: 45%;
            height: 100%;
        }

        .event-image {
            border-radius: 100%;
            width: 30%;
            margin-left: 120px;
            margin-top: 110px;
        }

        .details {
            font-size: 22px;
            margin-left: 60px;
        }

        .details1 {
            margin-top: 30px;
        }

        .abc {
            color: #cdcaca;
            font-size: 15px;
            margin-left: 60px;
        }

        .abc1 {
            margin-top: -50px;
        }
    </style>
</head>

<body>
    <div class="main-div">
        <div>
            <img src="./logo-removebg-preview.png">
            <div class="event-name">DJ Night</div>
        </div>
        <div class="agree">I agree i only upload <span class="text-color">Quailty work</span></div>

        <div class="side-details">
            <div>
                <img class="event-image" src="./photo-1492684223066-81342ee5ff30.jpg">
                <h1 class="details details1">Location</h1>
                <span class="abc abc1">Uni mall</span>
                <h1 class="details details2">Ticket price</h1>
                <span class="abc abc2">80</span>
            </div>
        </div>
    </div>
</body>
</html>
  `;

  let generatePdf = async () => {
    const file = await printToFileAsync({
      html: html,
      base64: false
    });

    await shareAsync(file.uri);
  };

  return (
    <View style={styles.container}>
      <TextInput value={name} placeholder="Name" style={styles.textInput} onChangeText={(value) => setName(value)} />
      <Button title="Generate PDF" onPress={generatePdf} />
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  textInput: {
    alignSelf: "stretch",
    padding: 8,
    margin: 8
  }
});